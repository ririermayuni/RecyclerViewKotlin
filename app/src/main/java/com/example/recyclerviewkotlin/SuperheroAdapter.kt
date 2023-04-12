package com.example.recyclerviewkotlin

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AbsListView.RecyclerListener
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.security.AccessControlContext
import java.util.EventListener

class SuperheroAdapter(private val context: Context, private val superhero: List<Superhero>, val listener: (Superhero) -> Unit)
    : RecyclerView.Adapter<SuperheroAdapter.SuperheroViewHolder>() {

    class SuperheroViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val imgSuperhero = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameSuperhero = view.findViewById<TextView>(R.id.tv_item_name)
        val desSuperhero = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(superhero: Superhero, listener: (Superhero) -> Unit) {
            imgSuperhero.setImageResource(superhero.imgsuperhero)
            nameSuperhero.text = superhero.nameSuperhero
            desSuperhero.text = superhero.desSuperhero
            itemView.setOnClickListener {
                listener(superhero)
            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperheroViewHolder {
        return SuperheroViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_superhero, parent, false)
        )
    }

    override fun onBindViewHolder(holder: SuperheroViewHolder, position: Int) {
        holder.bindView(superhero[position], listener)
    }

    override fun getItemCount(): Int = superhero.size
    }



