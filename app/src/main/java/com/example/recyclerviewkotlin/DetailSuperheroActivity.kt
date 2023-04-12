package com.example.recyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailSuperheroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_superhero)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val superhero =intent.getParcelableExtra<Superhero>(MainActivity.INTENT_PARCELABLE)

        val imgSuperhero = findViewById<ImageView>(R.id.img_item_photo)
        val nameSuperhero = findViewById<TextView>(R.id.tv_item_name)
        val desSuperhero = findViewById<TextView>(R.id.tv_item_description)

        imgSuperhero.setImageResource(superhero?.imgsuperhero!!)
        nameSuperhero.text = superhero.nameSuperhero
        desSuperhero.text = superhero.desSuperhero


    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}