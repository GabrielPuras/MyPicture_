package com.example.mypicture

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class PersonasActivity : AppCompatActivity() {

    // Botón imagen Familia
    lateinit var imageButtonFamilia: ImageButton

    // Botón imagen Amigos
    lateinit var imageButtonAmigos: ImageButton

    // Botón imagen Profesionales
    lateinit var imageButtonProfesionales: ImageButton

    // Botón imagen Mascotas
    lateinit var imageButtonMascotas: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personas)

        // Inicializar el ImageButton
        imageButtonFamilia = findViewById(R.id.imageButtonFamilia)

        // Agregar un OnClickListener al ImageButton
        imageButtonFamilia.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(this, R.raw.familia)
            mediaPlayer.start()

            // Llevar al usuario a la Activity
            val intent = Intent(this, FamiliaPersonasActivity::class.java)
            startActivity(intent)
        }

        // Inicializar el ImageButton
        imageButtonAmigos = findViewById(R.id.imageButtonAmigos)

        // Agregar un OnClickListener al ImageButton
        imageButtonAmigos.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(this, R.raw.amigos)
            mediaPlayer.start()

            // Llevar al usuario a la Activity
            val intent = Intent(this, AmigosPersonasActivity::class.java)
            startActivity(intent)
        }

        // Inicializar el ImageButton
        imageButtonMascotas = findViewById(R.id.imageButtonMascotas)

        // Agregar un OnClickListener al ImageButton
        imageButtonMascotas.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(this, R.raw.mascotas)
            mediaPlayer.start()

            // Llevar al usuario a la Activity
            val intent = Intent(this, MascotasPersonasActivity::class.java)
            startActivity(intent)
        }


        // Inicializar el ImageButton
        imageButtonProfesionales = findViewById(R.id.imageButtonProfesionales)

        // Agregar un OnClickListener al ImageButton
        imageButtonProfesionales.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(this, R.raw.profesionales)
            mediaPlayer.start()

            // Llevar al usuario a la Activity
            val intent = Intent(this, ProfesionalesPersonasActivity::class.java)
            startActivity(intent)
        }




    }

    fun volverAMainActivity(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}