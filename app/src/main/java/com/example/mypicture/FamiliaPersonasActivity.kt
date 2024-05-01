package com.example.mypicture

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class FamiliaPersonasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_familia_personas)

        //Sonido QUIERO
        var imageButtonPadre = findViewById<ImageButton>(R.id.imageButtonPadre)
        imageButtonPadre.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.padre
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        //Sonido Madre
        var imageButtonMadre = findViewById<ImageButton>(R.id.imageButtonMadre)
        imageButtonMadre.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.madre
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        //Sonido TIO
        var imageButtonTio = findViewById<ImageButton>(R.id.imageButtonTio)
        imageButtonTio.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.tio
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        //Sonido TIA
        var imageButtonTia = findViewById<ImageButton>(R.id.imageButtonTia)
        imageButtonTia.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.tia
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        //Sonido ABUELA
        var imageButtonAbuela = findViewById<ImageButton>(R.id.imageButtonAbuela)
        imageButtonAbuela.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.abuela
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        //Sonido ABUELA 2
        var imageButtonAbuelaDos = findViewById<ImageButton>(R.id.imageButtonAbuelaDos)
        imageButtonAbuelaDos.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.abuela
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        //Sonido JADE
        var imageButtonJade = findViewById<ImageButton>(R.id.imageButtonJade)
        imageButtonJade.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.jade
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        //Sonido ALEXIS
        var imageButtonAlexis = findViewById<ImageButton>(R.id.imageButtonAlexis)
        imageButtonAlexis.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.alexis
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