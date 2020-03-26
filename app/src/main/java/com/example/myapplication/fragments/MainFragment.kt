package com.example.myapplication.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.R
import com.example.myapplication.models.Movie
import com.example.myapplication.adapters.ListAdapter
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {
    private val moviesList = listOf(
            Movie(
                    "The Godfather",
                    "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.",
                    1972
            ),
            Movie(
                    "Interstellar",
                    "Epic science fiction film directed, co-written and co-produced by Christopher Nolan",
                    2013
            ),
            Movie(
                    "Pacific Rim",
                    "As a war between humankind and monstrous sea creatures wages on, a former pilot and a trainee are paired up to drive a seemingly obsolete special weapon in a desperate effort to save the world from the apocalypse.\n",
                    2013
            ),
            Movie(
                    "Geostorm", "When the network of satellites designed to control the global climate starts to attack Earth, it's a race against the clock",
                    2017
            ),
            Movie(
                    "The Day After Tomorrow",
                    "Jack Hall, paleoclimatologist, must make a daring trek from Washington, D.C. to New York City to reach his son, trapped in the cross-hairs of a sudden international storm which plunges the planet into a new Ice Age.\n", 2004
            ),
            Movie(
                    "2012",
                    "A frustrated writer struggles to keep his family alive when a series of global catastrophes threatens to annihilate mankind.",
                    2009
            ),
            Movie(
                    "I am Legend",
                    "Years after a plague kills most of humanity and transforms the rest into monsters, the sole survivor in New York City struggles valiantly to find a cure in this post-apocalyptic action thriller.",
                    2007
            )
    );

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?) :
            View? = inflater.inflate(R.layout.fragment_main, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        list_recycler_view.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = ListAdapter(moviesList, onClickListener = { _, movie ->
                Toast.makeText(context, "You clicked on ${movie.title}, ${movie.year.toString()}", Toast.LENGTH_SHORT).show()
            })
        }
    }

    companion object {
        fun newInstance(): MainFragment = MainFragment()
    }
}