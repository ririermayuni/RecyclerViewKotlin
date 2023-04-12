package com.example.recyclerviewkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.time.Instant

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.antman,
                "Ant-man",
                "antman memiliki kekuatan super"
            ),
            Superhero(
                R.drawable.black,
                "Black panter",
                "black merupakan perempuan berkekuatan super"
            ),
            Superhero(
                R.drawable.captain,
                "Captain America",
                "Captain sangat keren"
            ),
            Superhero(
                R.drawable.doctor,
                "Doktor",
                "dia seorang berkekuatan super dan dapat menyembuhkan orang "
            ),
            Superhero(
                R.drawable.gemora,
                "Gemora",
                "gemora sangat cantik dan kuat"
            ),
            Superhero(
                R.drawable.hawkeye,
                "Howkaye",
                "pemanah yang hebat"
            ),
            Superhero(
                R.drawable.hulk,
                "Hulk",
                "memiliki kekuatan yang sangat kuat dan suka menolong"
            ),
            Superhero(
                R.drawable.iron,
                "Ironman",
                "lorem lipsum lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.loki,
                "Loki",
                "loki memegang pedang"
            ),
            Superhero(
                R.drawable.nebula,
                "Nebula",
                "perempuan"
            ),
            Superhero(
                R.drawable.panter,
                "Panter",
                "panter hitam "
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList) {
            val intent = Intent(this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}