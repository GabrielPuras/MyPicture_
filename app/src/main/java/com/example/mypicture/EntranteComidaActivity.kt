package com.example.mypicture

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class EntranteComidaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entrante_comida)

        // Sonido CROQUETAS
        var imageButtonCroquetas = findViewById<ImageButton>(R.id.imageButtonCroquetas)
        imageButtonCroquetas.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.croquetas
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido PATE
        var imageButtonPate = findViewById<ImageButton>(R.id.imageButtonPate)
        imageButtonPate.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.pate
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido HUMMUS
        var imageButtonHummus = findViewById<ImageButton>(R.id.imageButtonHummus)
        imageButtonHummus.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.hummus
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido OLIVAS
        var imageButtonOlivas = findViewById<ImageButton>(R.id.imageButtonOlivas)
        imageButtonOlivas.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.olivas
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido SOPA
        var imageButtonSopa = findViewById<ImageButton>(R.id.imageButtonSopa)
        imageButtonSopa.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.sopa
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido TAPAS
        var imageButtonTapas = findViewById<ImageButton>(R.id.imageButtonTapas)
        imageButtonTapas.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.tapas
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido ENSALADA
        var imageButtonEnsalada = findViewById<ImageButton>(R.id.imageButtonEnsalada)
        imageButtonEnsalada.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.ensalada
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido CHORIZO
        var imageButtonChorizo = findViewById<ImageButton>(R.id.imageButtonChorizo)
        imageButtonChorizo.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.chorizo
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido JAMON
        var imageButtonJamon = findViewById<ImageButton>(R.id.imageButtonJamon)
        imageButtonJamon.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.jamon
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido ENSALADA PASTA
        var imageButtonEnsaladaPasta = findViewById<ImageButton>(R.id.imageButtonEnsaladaPasta)
        imageButtonEnsaladaPasta.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.ensalada_pasta
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