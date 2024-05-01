package com.example.mypicture

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class ProfesionalesPersonasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profesionales_personas)

        //Sonido MEDICO
        var imageButtonMedico = findViewById<ImageButton>(R.id.imageButtonMedico)
        imageButtonMedico.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.medico
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        //Sonido LOGOPEDA
        var imageButtonLogopeda = findViewById<ImageButton>(R.id.imageButtonLogopeda)
        imageButtonLogopeda.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.logopeda
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        //Sonido FISIOTERAPEUTA
        var imageButtonFisioterapeuta = findViewById<ImageButton>(R.id.imageButtonFisioterapeuta)
        imageButtonFisioterapeuta.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.fisio
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        //Sonido NUTRICIONISTA
        var imageButtonNutricionista = findViewById<ImageButton>(R.id.imageButtonNutricionista)
        imageButtonNutricionista.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.nutricionista
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        //Sonido ENFERMERA
        var imageButtonEnfermera = findViewById<ImageButton>(R.id.imageButtonEnfermera)
        imageButtonEnfermera.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.enfermera
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        //Sonido DESTISTA
        var imageButtonDentista = findViewById<ImageButton>(R.id.imageButtonDentista)
        imageButtonDentista.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.dentista
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        //Sonido OFTALMOLOGO
        var imageButtonOftalmologo = findViewById<ImageButton>(R.id.imageButtonOftalmologo)
        imageButtonOftalmologo.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.oftamologo
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        //Sonido ORL
        var imageButtonOrl = findViewById<ImageButton>(R.id.imageButtonOrl)
        imageButtonOrl.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.orl
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