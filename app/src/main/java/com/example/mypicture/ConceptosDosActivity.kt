package com.example.mypicture

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton




class ConceptosDosActivity : AppCompatActivity() {

    // Botón imagen Conceptos
    lateinit var imageButtonConceptosMas: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conceptos_dos)


        // Sonido LLENO
        var imageButtonLleno = findViewById<ImageButton>(R.id.imageButtonLleno)
        imageButtonLleno.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.lleno
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido RAPIDO
        var imageButtonRapido = findViewById<ImageButton>(R.id.imageButtonRapido)
        imageButtonRapido.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.rapido
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido LENTO
        var imageButtonLento = findViewById<ImageButton>(R.id.imageButtonLento)
        imageButtonLento.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.lento
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido MOJADO
        var imageButtonMojado = findViewById<ImageButton>(R.id.imageButtonMojado)
        imageButtonMojado.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.mojado
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido LIMPIO
        var imageButtonLimpio = findViewById<ImageButton>(R.id.imageButtonLimpio)
        imageButtonLimpio.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.limpio
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido ROTO
        var imageButtonRoto = findViewById<ImageButton>(R.id.imageButtonRoto)
        imageButtonRoto.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.roto
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido SILENCIO
        var imageButtonSilencio = findViewById<ImageButton>(R.id.imageButtonSilencio)
        imageButtonSilencio.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.silencioso
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido RUIDOSO
        var imageButtonRuidoso = findViewById<ImageButton>(R.id.imageButtonRuidoso)
        imageButtonRuidoso.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.ruidoso
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido VACIO
        var imageButtonVacio = findViewById<ImageButton>(R.id.imageButtonVacio)
        imageButtonVacio.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.vacio
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido SUCIO
        var imageButtonSucio = findViewById<ImageButton>(R.id.imageButtonSucio)
        imageButtonSucio.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.sucio
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido SECO
        var imageButtonSeco = findViewById<ImageButton>(R.id.imageButtonSeco)
        imageButtonSeco.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.seco
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }



        // Inicializar el ImageButton
        imageButtonConceptosMas = findViewById(R.id.imageButtonConceptosMas)

        // Agregar un OnClickListener al ImageButton
        imageButtonConceptosMas.setOnClickListener {

            // Llevar al usuario a la Activity
            val intent = Intent(this, ConceptosColoresActivity::class.java)
            startActivity(intent)
        }




    }

    fun volverAMainActivity(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}