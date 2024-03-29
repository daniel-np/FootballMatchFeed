package com.example.matchcentreapp.ui

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.matchcentreapp.R
import com.example.matchcentreapp.data.match.TeamPlayer
import com.example.matchcentreapp.ui.team_stats.PlayersTeamAdapter
import com.example.matchcentreapp.ui.team_stats.TeamStatsViewModel
import com.example.matchcentreapp.utils.ImageFromUrlUtils
import com.example.matchcentreapp.utils.InjectorUtils
import kotlinx.android.synthetic.main.activity_team_stats.*

class TeamStatsActivity : AppCompatActivity() {

    // Views
    private lateinit var teamNameView: TextView
    private lateinit var teamIconView: ImageView
    private lateinit var playerListView: RecyclerView
    private lateinit var recyclerView: RecyclerView

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

        viewModel.getMatch().observe(this, Observer { it ->
            val homeTeam = it.data?.homeTeam

            teamNameView.text = homeTeam?.name

            val imageUrl = homeTeam?.imageUrl
            setImageAsync(imageUrl)

            val players: List<TeamPlayer?> = homeTeam?.players.orEmpty()
            setRecyclerViewData(players.sortedBy { it?.position })
        })
    }


    private fun initializeAwayTeamUi() {
        viewModel.getMatch().observe(this, Observer { it ->
            val awayTeam = it.data?.awayTeam

            teamNameView.text = awayTeam?.name

            val imageUrl = awayTeam?.imageUrl
            setImageAsync(imageUrl)

            val players: List<TeamPlayer?> = awayTeam?.players.orEmpty()
            setRecyclerViewData(players.sortedBy { it?.position })
        })
    }

    private fun setRecyclerViewData(players: List<TeamPlayer?>) {
        recyclerView = playerListView.apply {
            setHasFixedSize(true)

            layoutManager = LinearLayoutManager(context)

            adapter = PlayersTeamAdapter(players)
        }

    }

    private fun setImageAsync(imageUrl: String?) {
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
