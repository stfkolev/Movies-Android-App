package com.example.myapplication.viewholders

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.models.Movie
import java.util.zip.Inflater

class MovieViewHolder(inflater: LayoutInflater, parent: ViewGroup) : RecyclerView.ViewHolder(inflater.inflate(R.layout.list_item, parent, false)) {
    private var titleView: TextView? = null
    private var descView: TextView? = null
    private var yearView: TextView? = null

    init {
        this.titleView = itemView.findViewById(R.id.list_title)
        this.descView = itemView.findViewById(R.id.list_description)
        this.yearView = itemView.findViewById(R.id.list_year)
    }

    fun bind(movie: Movie) {
        this.titleView?.text = movie.title;
        this.descView?.text = movie.description;
        this.yearView?.text = movie.year.toString();
    }
}