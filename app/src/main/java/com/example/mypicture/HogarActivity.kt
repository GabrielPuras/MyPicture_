package com.example.mypicture

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class HogarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hogar)

        // Sonido BAÑO
        var imageButtonBano = findViewById<ImageButton>(R.id.imageButtonBano)
        imageButtonBano.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.bano
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido COCINA
        var imageButtonCocina = findViewById<ImageButton>(R.id.imageButtonCocina)
        imageButtonCocina.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.cocina
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido COMEDOR
        var imageButtonComedor = findViewById<ImageButton>(R.id.imageButtonComedor)
        imageButtonComedor.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.comedor
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido JARDIN
        var imageButtonJardin = findViewById<ImageButton>(R.id.imageButtonJardin)
        imageButtonJardin.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.jardin
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido ESTUDIO
        var imageButtonEstudio = findViewById<ImageButton>(R.id.imageButtonEstudio)
        imageButtonEstudio.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.estudio
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido SALON
        var imageButtonSalon = findViewById<ImageButton>(R.id.imageButtonSalon)
        imageButtonSalon.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.salon
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido DORMITORIO
        var imageButtonDormitorio = findViewById<ImageButton>(R.id.imageButtonDormitorio)
        imageButtonDormitorio.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.dormitorio
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido GARAJE
        var imageButtonGaraje = findViewById<ImageButton>(R.id.imageButtonGaraje)
        imageButtonGaraje.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.garaje
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido ESCALERAS
        var imageButtonEscaleras = findViewById<ImageButton>(R.id.imageButtonEscaleras)
        imageButtonEscaleras.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.escalera
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido PASILLO
        var imageButtonPasillo = findViewById<ImageButton>(R.id.imageButtonPasillo)
        imageButtonPasillo.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.pasillo
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