package com.example.mypicture

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class ComidaActivity : AppCompatActivity() {

    // Botón imagen ENTRANTES
    lateinit var imageButtonEntrante: ImageButton

    // Botón imagen PLATOS
    lateinit var imageButtonPlato: ImageButton

    // Botón imagen POSTRE
    lateinit var imageButtonPostre: ImageButton

    // Botón imagen POSTRE
    lateinit var imageButtonRestaurantes: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comida)

        // Inicializar el ImageButton
        imageButtonEntrante = findViewById(R.id.imageButtonEntrante)

        // Agregar un OnClickListener al ImageButton
        imageButtonEntrante.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(this, R.raw.entrantes)
            mediaPlayer.start()

            // Llevar al usuario a la Activity
            val intent = Intent(this, EntranteComidaActivity::class.java)
            startActivity(intent)
        }


        // Inicializar el ImageButton
        imageButtonPlato = findViewById(R.id.imageButtonPlato)

        // Agregar un OnClickListener al ImageButton
        imageButtonPlato.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(this, R.raw.platos)
            mediaPlayer.start()

            // Llevar al usuario a la Activity
            val intent = Intent(this, PlatoComidaActivity::class.java)
            startActivity(intent)
        }



        // Inicializar el ImageButton
        imageButtonPostre = findViewById(R.id.imageButtonPostre)

        // Agregar un OnClickListener al ImageButton
        imageButtonPostre.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(this, R.raw.postres)
            mediaPlayer.start()

            // Llevar al usuario a la Activity
            val intent = Intent(this, PostreComidaActivity::class.java)
            startActivity(intent)
        }



        // Inicializar el ImageButton
        imageButtonRestaurantes = findViewById(R.id.imageButtonRestaurantes)

        // Agregar un OnClickListener al ImageButton
        imageButtonRestaurantes.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(this, R.raw.restaurantes)
            mediaPlayer.start()

            // Llevar al usuario a la Activity
            val intent = Intent(this, RestaurantesComidaActivity::class.java)
            startActivity(intent)
        }


    }

    fun volverAMainActivity(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }


}