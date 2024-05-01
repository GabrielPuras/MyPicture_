package com.example.mypicture

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class FrasesHechasActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frases_hechas)


        // Prueba Sonido TU
        var imageButtonTu = findViewById<ImageButton>(R.id.imageButtonTu)
        imageButtonTu.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.tu
            ) // Sonido TU
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido HOLA
        var imageButtonHola = findViewById<ImageButton>(R.id.imageButtonHola)
        imageButtonHola.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.hola
            ) // Sonido HOLA
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido POR FAVOR
        var imageButtonPorFavor = findViewById<ImageButton>(R.id.imageButtonPorFavor)
        imageButtonPorFavor.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.por_favor
            ) // Sonido POR FAVOR
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido ADIOS
        var imageButtonAdios = findViewById<ImageButton>(R.id.imageButtonAdios)
        imageButtonAdios.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.adios
            ) // Sonido ADIOS
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido GRACIAS
        var imageButtonGracias = findViewById<ImageButton>(R.id.imageButtonGracias)
        imageButtonGracias.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.gracias
            ) // Sonido GRACIAS
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido LO SIENTO
        var imageButtonLoSiento = findViewById<ImageButton>(R.id.imageButtonLoSiento)
        imageButtonLoSiento.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.lo_siento
            ) // Sonido LO SIENTO
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido QUE TAL
        var imageButtonQueTal = findViewById<ImageButton>(R.id.imageButtonQueTal)
        imageButtonQueTal.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.que_tal
            ) // Sonido QUE TAL
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido COMO TE LLAMAS
        var imageButtonComoTeLlamas = findViewById<ImageButton>(R.id.imageButtonComoTeLlamas)
        imageButtonComoTeLlamas.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.como_te_llamas
            ) // Sonido COMO TE LLAMAS
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido CUAL ES TU NOMBRE
        var imageButtonCualEsTuNombre = findViewById<ImageButton>(R.id.imageButtonCualEsTuNombre)
        imageButtonCualEsTuNombre.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.cual_es_tu_nombre
            ) // Sonido CUAL ES TU NOMBRE
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido NO ENTIENDO
        var imageButtonNoEntiendo = findViewById<ImageButton>(R.id.imageButtonNoEntiendo)
        imageButtonNoEntiendo.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.no_entiendo
            ) // Sonido NO ENTIENDO
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido NO LO SE
        var imageButtonNoLoSe = findViewById<ImageButton>(R.id.imageButtonNoLoSe)
        imageButtonNoLoSe.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.no_lo_se
            ) // Sonido NO LO SE
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido QUIERO MAS
        var imageButtonQuieroMAS = findViewById<ImageButton>(R.id.imageButtonQuieroMas)
        imageButtonQuieroMAS.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.quiero_mas
            ) // Sonido QUIERO MAS
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido FELIZ CUMPLEAÑOS
        var imageButtonFelizCumpleanos = findViewById<ImageButton>(R.id.imageButtonFelizCumpleanos)
        imageButtonFelizCumpleanos.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.feliz_cumple
            ) // Sonido FELIZ CUMPLEAÑOS
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido VAMONOS A CASA
        var imageButtonVamonosACasa = findViewById<ImageButton>(R.id.imageButtonVamonosACasa)
        imageButtonVamonosACasa.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.vamonos_a_casa
            ) // Sonido VAMONOS A CASA
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido NO ME GUSTA
        var imageButtonNoMeGusta = findViewById<ImageButton>(R.id.imageButtonNoMeGusta)
        imageButtonNoMeGusta.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.no_me_gusta
            ) // Sonido NO ME GUSTA
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido ME GUSTA
        var imageButtonMeGusta = findViewById<ImageButton>(R.id.imageButtonMeGusta)
        imageButtonMeGusta.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.me_gusta
            ) // Sonido ME GUSTA
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