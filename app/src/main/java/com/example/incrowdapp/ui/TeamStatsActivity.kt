package com.example.incrowdapp.ui

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.RecyclerView
import com.example.incrowdapp.R
import com.example.incrowdapp.ui.team_stats.TeamStatsViewModel
import com.example.incrowdapp.utils.ImageFromUrlUtils
import com.example.incrowdapp.utils.InjectorUtils
import kotlinx.android.synthetic.main.activity_team_stats.*

class TeamStatsActivity : AppCompatActivity() {

    // Views
    private lateinit var teamNameView: TextView
    private lateinit var teamIconView: ImageView
    private lateinit var playerListView: RecyclerView

    private lateinit var viewModel: TeamStatsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team_stats)


        initializeViews()
        initializeViewModel()

        val bundle: Bundle? = intent.extras
        if (bundle != null) {
            val isHomeTeam = bundle.getBoolean("isHomeTeam")
            initializeUi(isHomeTeam)
        } else {
            super.finish()
        }

    }

    private fun initializeViews() {
        teamNameView = teamName
        teamIconView = teamIcon
        playerListView = playerList
    }

    private fun initializeViewModel() {
        val factory = InjectorUtils.provideTeamStatsViewModelFactory()
        viewModel = ViewModelProviders.of(this, factory)
            .get(TeamStatsViewModel::class.java)
    }

    private fun initializeUi(isHomeTeam: Boolean) {
        if (isHomeTeam) {
            initializeHomeTeamUi()
        } else {
            initializeAwayTeamUi()
        }
    }

    private fun initializeHomeTeamUi() {

        viewModel.getMatch().observe(this, Observer {

            teamNameView.text = it.data?.homeTeam?.name

            val imageUrl = it.data?.homeTeam?.imageUrl
            setImageAsync(imageUrl)
        })
    }


    private fun initializeAwayTeamUi() {
        viewModel.getMatch().observe(this, Observer {

            teamNameView.text = it.data?.awayTeam?.name

            val imageUrl = it.data?.awayTeam?.imageUrl
            setImageAsync(imageUrl)


        })
    }

    private fun setImageAsync(imageUrl:String?) {
        if (imageUrl != null) {
            AsyncTask.execute {
                Runnable {
                    val bitmap = ImageFromUrlUtils.fetchImage(imageUrl)
                    runOnUiThread {
                        Runnable { teamIcon.setImageBitmap(bitmap) }.run()
                    }
                }.run()
            }
        }
    }

}
