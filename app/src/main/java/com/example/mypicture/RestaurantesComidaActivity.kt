package com.example.mypicture

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class RestaurantesComidaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurantes_comida)

        // Sonido ITALIANO
        var imageButtonItaliano = findViewById<ImageButton>(R.id.imageButtonItaliano)
        imageButtonItaliano.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.italiano
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido MEXICANO
        var imageButtonMexicano = findViewById<ImageButton>(R.id.imageButtonMexicano)
        imageButtonMexicano.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.mexicano
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido ASIATICO
        var imageButtonAsiatico = findViewById<ImageButton>(R.id.imageButtonAsiatico)
        imageButtonAsiatico.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.asiatico
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido MCDONALDS
        var imageButtonMcdonalds = findViewById<ImageButton>(R.id.imageButtonMcdonalds)
        imageButtonMcdonalds.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.mcdonalds
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido RESTAURANTE CLASICO
        var imageButtonRestauranteClasico = findViewById<ImageButton>(R.id.imageButtonRestauranteClasico)
        imageButtonRestauranteClasico.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.restaurante_clasico
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }


    }

    fun volverAMainActivity(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

}