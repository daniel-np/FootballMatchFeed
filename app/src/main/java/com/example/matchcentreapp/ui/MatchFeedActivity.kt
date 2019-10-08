package com.example.matchcentreapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.matchcentreapp.data.commentary.CommentaryEntry
import com.example.matchcentreapp.ui.match_feed.CommentaryFeedAdapter
import com.example.matchcentreapp.ui.match_feed.MatchFeedViewModel
import com.example.matchcentreapp.utils.InjectorUtils
import kotlinx.android.synthetic.main.activity_match_feed.*
import java.lang.StringBuilder
import com.example.matchcentreapp.R
import android.os.AsyncTask
import androidx.appcompat.widget.LinearLayoutCompat
import com.example.matchcentreapp.utils.ImageFromUrlUtils


class MatchFeedActivity : AppCompatActivity() {

    // Views
    private lateinit var homeTeamTitleView: TextView
    private lateinit var homeTeamIconView: ImageView
    private lateinit var homeTeamLayoutView: LinearLayoutCompat
    private lateinit var awayTeamTitleView: TextView
    private lateinit var awayTeamIconView: ImageView
    private lateinit var awayTeamLayoutView: LinearLayoutCompat
    private lateinit var recyclerView: RecyclerView
    private lateinit var scoreTextView: TextView
    private lateinit var venueTextView: TextView
    // Model
    private lateinit var viewModel: MatchFeedViewModel
    private lateinit var commentaryEntries: List<CommentaryEntry>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_match_feed)

        initializeViews()
        initializeViewModel()
        initializeUi()
    }

    private fun initializeViews() {
        homeTeamTitleView = homeTeamTitle
        homeTeamIconView = homeTeamIcon
        homeTeamLayoutView = homeTeamLayout
        awayTeamTitleView = awayTeamTitle
        awayTeamIconView = awayTeamIcon
        awayTeamLayoutView = awayTeamLayout
        scoreTextView = teamScore
        venueTextView = venueName

        lateinit var intent: Intent
        homeTeamLayoutView.setOnClickListener {
            intent = Intent(this, TeamStatsActivity::class.java)
            intent.putExtra("isHomeTeam", true)
            startActivity(intent)
        }

        awayTeamLayoutView.setOnClickListener {
            intent = Intent(this, TeamStatsActivity::class.java)
            intent.putExtra("isHomeTeam", false)
            startActivity(intent)
        }
    }

    private fun initializeViewModel() {
        val factory = InjectorUtils.provideMatchViewModelFactory()
        viewModel = ViewModelProviders.of(this, factory)
            .get(MatchFeedViewModel::class.java)
    }

    private fun initializeUi() {

        setMatchDataToUi()
        setCommentaryDataToUi()
    }

    private fun setMatchDataToUi() {
        viewModel.getMatch().observe(this, Observer {

            val homeUrl = it.data?.homeTeam?.imageUrl
            if (homeUrl != null) {
                AsyncTask.execute {
                    Runnable {
                        val bitmap = ImageFromUrlUtils.fetchImage(homeUrl)
                        runOnUiThread {
                            Runnable { homeTeamIconView.setImageBitmap(bitmap) }.run()
                        }
                    }.run()
                }
            }
            val awayUrl = it.data?.awayTeam?.imageUrl
            if (awayUrl != null) {
                AsyncTask.execute {
                    Runnable {
                        val bitmap = ImageFromUrlUtils.fetchImage(awayUrl)
                        runOnUiThread {
                            Runnable { awayTeamIconView.setImageBitmap(bitmap) }.run()
                        }
                    }.run()
                }
            }

            venueTextView.text = it.data?.venue?.name

        })
    }

    private fun setCommentaryDataToUi() {
        viewModel.getCommentary().observe(this, Observer {
            // Team titles
            homeTeamTitleView.text = it?.data?.homeTeamName
            awayTeamTitleView.text = it?.data?.awayTeamName

            // Score
            val scoreStringBuilder = StringBuilder()
            scoreStringBuilder.append(it.data?.homeScore)
            scoreStringBuilder.append(" - ")
            scoreStringBuilder.append(it.data?.awayScore)
            scoreTextView.text = scoreStringBuilder

            // Commentaries
            commentaryEntries = it.data?.commentaryEntries.orEmpty()
            recyclerView = commentaryFeed.apply {
                setHasFixedSize(true)

                layoutManager = LinearLayoutManager(context)

                adapter = CommentaryFeedAdapter(commentaryEntries)
            }
        })
    }

}