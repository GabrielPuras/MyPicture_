package com.example.mypicture

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class ConceptosColoresActivity : AppCompatActivity() {

    // Botón imagen MENU
    lateinit var imageButtonConceptosColoresMas: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conceptos_colores)

        // Sonido Amarillo
        var imageButtonAmarillo = findViewById<ImageButton>(R.id.imageButtonAmarillo)
        imageButtonAmarillo.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.amarillo
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido AZUL
        var imageButtonAzul = findViewById<ImageButton>(R.id.imageButtonAzul)
        imageButtonAzul.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.azul
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido BLANCO
        var imageButtonBlanco = findViewById<ImageButton>(R.id.imageButtonBlanco)
        imageButtonBlanco.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.blanco
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido GRIS
        var imageButtonGris = findViewById<ImageButton>(R.id.imageButtonGris)
        imageButtonGris.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.gris
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido LILA
        var imageButtonLila = findViewById<ImageButton>(R.id.imageButtonLila)
        imageButtonLila.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.lila
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido MARRON
        var imageButtonMarron = findViewById<ImageButton>(R.id.imageButtonMarron)
        imageButtonMarron.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.marron
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido MORADO
        var imageButtonMorado = findViewById<ImageButton>(R.id.imageButtonMorado)
        imageButtonMorado.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.morado
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido NARANJA
        var imageButtonNaranja = findViewById<ImageButton>(R.id.imageButtonNaranja)
        imageButtonNaranja.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.naranja
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido NEGRO
        var imageButtonNegro = findViewById<ImageButton>(R.id.imageButtonNegro)
        imageButtonNegro.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.negro
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido ROJO
        var imageButtonRojo = findViewById<ImageButton>(R.id.imageButtonRojo)
        imageButtonRojo.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.rojo
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido ROSA
        var imageButtonRosa = findViewById<ImageButton>(R.id.imageButtonRosa)
        imageButtonRosa.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.rosa
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido VERDE
        var imageButtonVerde = findViewById<ImageButton>(R.id.imageButtonVerde)
        imageButtonVerde.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.verde
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }


        // Inicializar el ImageButton
        imageButtonConceptosColoresMas = findViewById(R.id.imageButtonConceptosColoresMas)

        // Agregar un OnClickListener al ImageButton
        imageButtonConceptosColoresMas.setOnClickListener {


            // Llevar al usuario a la Activity
            val intent = Intent(this, ConceptosNumerosActivity::class.java)
            startActivity(intent)
        }




    }

    fun volverAMainActivity(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

}