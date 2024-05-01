package com.example.mypicture

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class ConceptosActivity : AppCompatActivity() {

    // Botón imagen CONCEPTOS MAS
    lateinit var imageButtonConceptosMas: ImageButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conceptos)


        // Sonido HOY
        var imageButtonHoy = findViewById<ImageButton>(R.id.imageButtonHoy)
        imageButtonHoy.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.hoy
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido AYER
        var imageButtonAyer = findViewById<ImageButton>(R.id.imageButtonAyer)
        imageButtonAyer.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.ayer
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido AHORA
        var imageButtonAhora = findViewById<ImageButton>(R.id.imageButtonAhora)
        imageButtonAhora.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.ahora
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido DESPUES
        var imageButtonDespues = findViewById<ImageButton>(R.id.imageButtonDespues)
        imageButtonDespues.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.despues
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido DELANTE
        var imageButtonDelante = findViewById<ImageButton>(R.id.imageButtonDelante)
        imageButtonDelante.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.delante
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido DETRAS
        var imageButtonDetras = findViewById<ImageButton>(R.id.imageButtonDetras)
        imageButtonDetras.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.detras
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido ENCIMA
        var imageButtonEncima = findViewById<ImageButton>(R.id.imageButtonEncima)
        imageButtonEncima.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.encima
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido ABAJO
        var imageButtonAbajo = findViewById<ImageButton>(R.id.imageButtonAbajo)
        imageButtonAbajo.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.abajo
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido CALOR
        var imageButtonCaliente = findViewById<ImageButton>(R.id.imageButtonCaliente)
        imageButtonCaliente.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.calor
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido FRIO
        var imageButtonFrio = findViewById<ImageButton>(R.id.imageButtonFrio)
        imageButtonFrio.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.frio
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido DENTRO
        var imageButtonDentro = findViewById<ImageButton>(R.id.imageButtonDentro)
        imageButtonDentro.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.dentro
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido FUERA
        var imageButtonFuera = findViewById<ImageButton>(R.id.imageButtonFuera)
        imageButtonFuera.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.fuera
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido IZQUIERDA
        var imageButtonIzquierda = findViewById<ImageButton>(R.id.imageButtonIzquierda)
        imageButtonIzquierda.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.izquierda
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido DERECHA
        var imageButtonDerecha = findViewById<ImageButton>(R.id.imageButtonDerecha)
        imageButtonDerecha.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.derecha
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido PEQUEÑO
        var imageButtonPequeno = findViewById<ImageButton>(R.id.imageButtonPequeno)
        imageButtonPequeno.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.pequeno
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido GRANDE
        var imageButtonGrande = findViewById<ImageButton>(R.id.imageButtonGrande)
        imageButtonGrande.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.grande
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido ANTES
        var imageButtonAntes = findViewById<ImageButton>(R.id.imageButtonAntes)
        imageButtonAntes.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.antes
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }


        // PASO ACTIVITY CONCEPTOS 2

        imageButtonConceptosMas = findViewById(R.id.imageButtonConceptosMas)

        // Agregar un OnClickListener al ImageButton
        imageButtonConceptosMas.setOnClickListener {

            // Llevar al usuario a la Activity
            val intent = Intent(this, ConceptosDosActivity::class.java)
            startActivity(intent)
        }







    }

    fun volverAMainActivity(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }


}