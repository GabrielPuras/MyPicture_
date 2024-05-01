package com.example.mypicture

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class BebidasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bebidas)


        // Prueba Sonido ZUMO NARANJA
        var imageButtonZumoNaranja = findViewById<ImageButton>(R.id.imageButtonZumoNaranja)
        imageButtonZumoNaranja.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.zumo_naranja
            ) // Sonido ZUMO NARANJA
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido ZUMO MANZANA
        var imageButtonZumoManzana = findViewById<ImageButton>(R.id.imageButtonZumoManzana)
        imageButtonZumoManzana.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.zumo_manzana
            ) // Sonido ZUMO MANZANA
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido AGUA
        var imageButtonAgua = findViewById<ImageButton>(R.id.imageButtonAgua)
        imageButtonAgua.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.agua
            ) // Sonido AGUA
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido COLACAO
        var imageButtonColaCao = findViewById<ImageButton>(R.id.imageButtonColaCao)
        imageButtonColaCao.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.colacao
            ) // Sonido COLACAO
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido COCACOLA
        var imageButtonCocaCola = findViewById<ImageButton>(R.id.imageButtonCocaCola)
        imageButtonCocaCola.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.coca_cola
            ) // Sonido COCACOLA
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido LECHE
        var imageButtonLeche = findViewById<ImageButton>(R.id.imageButtonLeche)
        imageButtonLeche.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.leche
            ) // Sonido LECHE
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido NESTEA
        var imageButtonNestea = findViewById<ImageButton>(R.id.imageButtonNestea)
        imageButtonNestea.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.nestea
            ) // Sonido NESTEA
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido CHAMPIN
        var imageButtonChampin = findViewById<ImageButton>(R.id.imageButtonChampin)
        imageButtonChampin.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.champin
            ) // Sonido CHAMPIN
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
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