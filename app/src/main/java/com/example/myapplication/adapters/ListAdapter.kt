package com.example.myapplication.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.models.Movie
import com.example.myapplication.viewholders.MovieViewHolder

typealias MovieClickListener = (View, Movie) -> Unit

class ListAdapter(
        private val list: List<Movie>,
        private val onClickListener: MovieClickListener
) : RecyclerView.Adapter<MovieViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val inflater = LayoutInflater.from(parent.context)

        return MovieViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie: Movie = list[position]

        holder.bind(movie)
        holder.itemView.setOnClickListener{ view ->
            onClickListener(view, movie)
        }
    }

    override fun getItemCount():
            Int = list.size
}