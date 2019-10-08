package com.example.matchcentreapp.ui.match_feed

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.matchcentreapp.R
import com.example.matchcentreapp.data.commentary.CommentaryEntry
import java.lang.StringBuilder

class CommentaryFeedAdapter(private val commentaryEntries: List<CommentaryEntry>) :
    RecyclerView.Adapter<CommentaryFeedAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var typeTextView: TextView = itemView.findViewById(R.id.commentaryFeedItemType)
        var bodyTextView: TextView = itemView.findViewById(R.id.commentaryFeedItemBody)
    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_commentary_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return commentaryEntries.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val typeStringBuilder = StringBuilder()
        typeStringBuilder.append(commentaryEntries[position].time ?: "")
        typeStringBuilder.append(" ")
        typeStringBuilder.append(commentaryEntries[position].type?.substring(0,1)?.capitalize())
        typeStringBuilder.append(commentaryEntries[position].type?.substring(1))
        typeStringBuilder.append("! ")

        holder.typeTextView.text = typeStringBuilder
        holder.bodyTextView.text = commentaryEntries[position].comment

    }


}