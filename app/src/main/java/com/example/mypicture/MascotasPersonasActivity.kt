package com.example.mypicture

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class MascotasPersonasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mascotas_personas)

        // Sonido GATO
        var imageButtonGato = findViewById<ImageButton>(R.id.imageButtonGato)
        imageButtonGato.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.gato
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido PERRO
        var imageButtonPerro = findViewById<ImageButton>(R.id.imageButtonPerro)
        imageButtonPerro.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.perro
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido CONEJO
        var imageButtonConejo = findViewById<ImageButton>(R.id.imageButtonConejo)
        imageButtonConejo.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.conejo
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido PEZ
        var imageButtonPez = findViewById<ImageButton>(R.id.imageButtonPez)
        imageButtonPez.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.pez
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido PAJARO
        var imageButtonPajaro = findViewById<ImageButton>(R.id.imageButtonPajaro)
        imageButtonPajaro.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.pajaro
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido VACA
        var imageButtonVaca = findViewById<ImageButton>(R.id.imageButtonVaca)
        imageButtonVaca.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.vaca
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido CERDO
        var imageButtonCerdo = findViewById<ImageButton>(R.id.imageButtonCerdo)
        imageButtonCerdo.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.cerdo
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido OVEJA
        var imageButtonOveja = findViewById<ImageButton>(R.id.imageButtonOveja)
        imageButtonOveja.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.oveja
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido CABALLO
        var imageButtonCaballo = findViewById<ImageButton>(R.id.imageButtonCaballo)
        imageButtonCaballo.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.caballo
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido GALLINA
        var imageButtonGallina = findViewById<ImageButton>(R.id.imageButtonGallina)
        imageButtonGallina.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.gallina
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