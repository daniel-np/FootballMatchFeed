package com.example.incrowdapp.ui

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.incrowdapp.data.commentary.CommentaryEntry
import com.example.incrowdapp.ui.match_feed.CommentaryFeedAdapter
import com.example.incrowdapp.ui.match_feed.MatchFeedViewModel
import com.example.incrowdapp.utils.InjectorUtils
import kotlinx.android.synthetic.main.activity_match_feed.*
import java.lang.StringBuilder
import java.net.URL
import com.example.incrowdapp.R
import android.graphics.Bitmap
import android.os.AsyncTask
import java.net.HttpURLConnection


class MatchFeedActivity : AppCompatActivity() {

    // Views
    private lateinit var homeTeamTitleView: TextView
    private lateinit var homeTeamIconView: ImageView
    private lateinit var awayTeamTitleView: TextView
    private lateinit var awayTeamIconView: ImageView
    private lateinit var recyclerView: RecyclerView
    private lateinit var scoreTextView: TextView
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
        awayTeamTitleView = awayTeamTitle
        awayTeamIconView = awayTeamIcon
        scoreTextView = teamScore
    }

    private fun initializeViewModel() {
        val factory = InjectorUtils().provideMatchViewModelFactory()
        viewModel = ViewModelProviders.of(this, factory)
            .get(MatchFeedViewModel::class.java)
    }

    private fun initializeUi() {

        setIconsToUi()
        setCommentaryDataToUi()
    }

    private fun setIconsToUi() {
        viewModel.getMatch().observe(this, Observer {

            val homeUrl = it.data?.homeTeam?.imageUrl
            if (it.data?.homeTeam?.imageUrl != null) {
                AsyncTask.execute {
                    Runnable {
                        val bitmap = getImageFromUrlString(homeUrl!!)
                        runOnUiThread{
                            Runnable { homeTeamIconView.setImageBitmap(bitmap)}.run()
                        }
                    }.run()
                }
            }
            val awayUrl = it.data?.awayTeam?.imageUrl
            if (it.data?.awayTeam?.imageUrl != null) {
                AsyncTask.execute {
                    Runnable {
                        val bitmap = getImageFromUrlString(awayUrl!!)
                        runOnUiThread{
                            Runnable { awayTeamIconView.setImageBitmap(bitmap)}.run()
                        }
                    }.run()
                }
            }

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
                // use this setting to improve performance if you know that changes
                // in content do not change the layout size of the RecyclerView
                setHasFixedSize(true)

                // use a linear layout manager
                layoutManager = LinearLayoutManager(context)

                // specify an viewAdapter (see also next example)
                adapter =
                    CommentaryFeedAdapter(commentaryEntries)
            }
            val itemDecor =
                DividerItemDecoration(recyclerView.context, DividerItemDecoration.HORIZONTAL)
            recyclerView.addItemDecoration(itemDecor)
        })
    }

    private fun getImageFromUrlString(urlString: String): Bitmap? {
        val url = URL(urlString)
        val urlConnection = url.openConnection() as HttpURLConnection
        lateinit var image: Bitmap
        try {
            image = BitmapFactory.decodeStream(urlConnection.inputStream)
        } finally {
            urlConnection.disconnect()
        }
        return image
    }
}