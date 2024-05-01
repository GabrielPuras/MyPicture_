package com.example.mypicture

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class GustosActividadesActivity : AppCompatActivity() {

    // Botón imagen DEPORTES
    lateinit var imageButtonDeportes: ImageButton

    // Botón imagen REDES SOCIALES
    lateinit var imageButtonRedesSociales: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gustos_actividades)

        // Prueba Sonido Peliculas
        var imageButtonPeliculasSeries = findViewById<ImageButton>(R.id.imageButtonPeliculasSeries)
        imageButtonPeliculasSeries.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.peliculas_series
            ) // Sonido peliculas
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido MUSICA
        var imageButtonMusica = findViewById<ImageButton>(R.id.imageButtonMusica)
        imageButtonMusica.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.musica
            ) // Sonido MUSICA
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Inicializar el ImageButton
        imageButtonRedesSociales = findViewById(R.id.imageButtonRedesSociales)

        // Agregar un OnClickListener al ImageButton
        imageButtonRedesSociales.setOnClickListener {
            // Reproducir el sonido "verbos"
            val mediaPlayer = MediaPlayer.create(this, R.raw.redes_sociales)
            mediaPlayer.start()

            // Llevar al usuario a la Activity
            val intent = Intent(this, RedesGustosActivity::class.java)
            startActivity(intent)
        }

        // Inicializar el ImageButton
        imageButtonDeportes = findViewById(R.id.imageButtonDeportes)

        // Agregar un OnClickListener al ImageButton
        imageButtonDeportes.setOnClickListener {
            // Reproducir el sonido "verbos"
            val mediaPlayer = MediaPlayer.create(this, R.raw.deportes)
            mediaPlayer.start()

            // Llevar al usuario a la Activity
            val intent = Intent(this, DeportesGustosActivity::class.java)
            startActivity(intent)
        }



    }

    fun volverAMainActivity(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }


}