package com.example.laboratorio05.ui.movie

import android.graphics.Movie
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.laboratorio05.R
import com.example.laboratorio05.data.model.MovieModel

class MovieViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {

    private var nameTextView:TextView = itemView.findViewById(R.id.nameMovie)
    private var qualificationTextView:TextView = itemView.findViewById(R.id.qualificationMovie)
    private var imageMovieView:ImageView = itemView.findViewById(R.id.imageMovie)


    fun bind (movie:MovieModel){
        nameTextView.text = movie.name
        qualificationTextView.text = movie.name


    }
}

