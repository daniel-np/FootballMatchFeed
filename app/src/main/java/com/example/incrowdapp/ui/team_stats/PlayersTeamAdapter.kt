package com.example.incrowdapp.ui.team_stats

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.incrowdapp.R
import com.example.incrowdapp.data.match.TeamPlayer
import java.lang.StringBuilder


class PlayersTeamAdapter (private val players: List<TeamPlayer?>) :
    RecyclerView.Adapter<PlayersTeamAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var playerNameView: TextView = itemView.findViewById(R.id.playerNameItem)
        var playerPositionView: TextView = itemView.findViewById(R.id.playerPositionItem)
        var playerShirtNumberView: TextView = itemView.findViewById(R.id.playerShirtNumberItem)
        var playerCaptainView: TextView = itemView.findViewById(R.id.playerCaptainItem)
    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_player_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return players.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val pNameStringBuilder = StringBuilder()
        pNameStringBuilder.append(players[position]?.known ?: players[position]?.firstName)
        pNameStringBuilder.append(" ")
        pNameStringBuilder.append(players[position]?.lastName)

        holder.playerNameView.text = pNameStringBuilder
        holder.playerShirtNumberView.text = players[position]?.shirtNumber.toString()
        holder.playerPositionView.text = players[position]?.position
        val isCaptain = players[position]?.captain ?: false
        holder.playerCaptainView.text = if(isCaptain) "Captain" else ""
    }
}


