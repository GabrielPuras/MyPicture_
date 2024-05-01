package com.example.mypicture

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class PostreComidaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_postre_comida)

        //Sonido YOGUR
        var imageButtonYogur = findViewById<ImageButton>(R.id.imageButtonYogur)
        imageButtonYogur.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.yogur
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido CHOCOLATE
        var imageButtonChocolate = findViewById<ImageButton>(R.id.imageButtonChocolate)
        imageButtonChocolate.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.chocolate
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido FRUTAS
        var imageButtonFrutas = findViewById<ImageButton>(R.id.imageButtonFrutas)
        imageButtonFrutas.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.frutas
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido GALLETAS
        var imageButtonGalletas = findViewById<ImageButton>(R.id.imageButtonGalletas)
        imageButtonGalletas.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.galletas
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido MUFFIN
        var imageButtonMuffin = findViewById<ImageButton>(R.id.imageButtonMuffin)
        imageButtonMuffin.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.muffin
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido CROISSANT
        var imageButtonCroissant = findViewById<ImageButton>(R.id.imageButtonCroissant)
        imageButtonCroissant.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.croissant
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido HELADO
        var imageButtonHelado = findViewById<ImageButton>(R.id.imageButtonHelado)
        imageButtonHelado.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.helado
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido PASTEL
        var imageButtonPastel = findViewById<ImageButton>(R.id.imageButtonPastel)
        imageButtonPastel.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.pastel
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido CREP
        var imageButtonCrep = findViewById<ImageButton>(R.id.imageButtonCrep)
        imageButtonCrep.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.crep
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido QUESO
        var imageButtonQueso = findViewById<ImageButton>(R.id.imageButtonQueso)
        imageButtonQueso.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.queso
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido MERMELADA
        var imageButtonMermelada = findViewById<ImageButton>(R.id.imageButtonMermelada)
        imageButtonMermelada.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.mermelada
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido MIEL
        var imageButtonMiel = findViewById<ImageButton>(R.id.imageButtonMiel)
        imageButtonMiel.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.miel
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