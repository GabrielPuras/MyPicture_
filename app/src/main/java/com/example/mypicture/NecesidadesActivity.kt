package com.example.mypicture

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class NecesidadesActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_necesidades)

        // Prueba Sonido FRIO
        var imageButtonFrio = findViewById<ImageButton>(R.id.imageButtonFrio)
        imageButtonFrio.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.frio
            ) // Sonido FRIO
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido CALOR
        var imageButtonCalor = findViewById<ImageButton>(R.id.imageButtonCalor)
        imageButtonCalor.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.calor
            ) // Sonido CALOR
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido ME MOLESTA EL RUIDO
        var imageButtonMeMolestaElRuido = findViewById<ImageButton>(R.id.imageButtonMeMolestaElRuido)
        imageButtonMeMolestaElRuido.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.me_molesta_el_ruido
            ) // Sonido ME MOLESTA EL RUIDO
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido IR AL BANO
        var imageButtonIrAlBano = findViewById<ImageButton>(R.id.imageButtonIrAlBano)
        imageButtonIrAlBano.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.ir_al_bano
            ) // Sonido IR AL BANO
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido ME DUELE
        var imageButtonMeDuele = findViewById<ImageButton>(R.id.imageButtonMeDuele)
        imageButtonMeDuele.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.me_duele
            ) // Sonido ME DUELE
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido ESTOY MAL
        var imageButtonEstoyMal = findViewById<ImageButton>(R.id.imageButtonEstoyMal)
        imageButtonEstoyMal.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.estoy_mal
            ) // Sonido ESTOY MAL
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido ESTOY BIEN
        var imageButtonEstoyBien = findViewById<ImageButton>(R.id.imageButtonEstoyBien)
        imageButtonEstoyBien.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.estoy_bien
            ) // Sonido ESTOY BEIN
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido ESTOY REGULAR
        var imageButtonEstoyRegular = findViewById<ImageButton>(R.id.imageButtonEstoyRegular)
        imageButtonEstoyRegular.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.estoy_regular
            ) // Sonido ESTOY REGULAR
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido HAMBRE
        var imageButtonHambre = findViewById<ImageButton>(R.id.imageButtonHambre)
        imageButtonHambre.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.hambre
            ) // Sonido HAMBRE
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido SED
        var imageButtonSed = findViewById<ImageButton>(R.id.imageButtonSed)
        imageButtonSed.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.sed
            ) // Sonido SED
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