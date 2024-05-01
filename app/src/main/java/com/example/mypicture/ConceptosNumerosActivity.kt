package com.example.mypicture

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class ConceptosNumerosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conceptos_numeros)

        // Sonido CERO
        var imageButtonCero = findViewById<ImageButton>(R.id.imageButtonCero)
        imageButtonCero.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.cero
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido UNO
        var imageButtonUno = findViewById<ImageButton>(R.id.imageButtonUno)
        imageButtonUno.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.uno
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido DOS
        var imageButtonDos = findViewById<ImageButton>(R.id.imageButtonDos)
        imageButtonDos.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.dos
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido TRES
        var imageButtonTres = findViewById<ImageButton>(R.id.imageButtonTres)
        imageButtonTres.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.tres
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido CUATRO
        var imageButtonCuatro = findViewById<ImageButton>(R.id.imageButtonCuatro)
        imageButtonCuatro.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.cuatro
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido CINCO
        var imageButtonCinco = findViewById<ImageButton>(R.id.imageButtonCinco)
        imageButtonCinco.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.cinco
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido SEIS
        var imageButtonSeis = findViewById<ImageButton>(R.id.imageButtonSeis)
        imageButtonSeis.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.seis
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido SIETE
        var imageButtonSiete = findViewById<ImageButton>(R.id.imageButtonSiete)
        imageButtonSiete.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.siete
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido OCHO
        var imageButtonOcho = findViewById<ImageButton>(R.id.imageButtonOcho)
        imageButtonOcho.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.ocho
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido NUEVE
        var imageButtonNueve = findViewById<ImageButton>(R.id.imageButtonNueve)
        imageButtonNueve.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.nueve
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