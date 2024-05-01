package com.example.mypicture

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class PlatoComidaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plato_comida)

        // Sonido Pollo
        var imageButtonPollo = findViewById<ImageButton>(R.id.imageButtonPollo)
        imageButtonPollo.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.pollo
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido CERDO
        var imageButtonCerdoPlato = findViewById<ImageButton>(R.id.imageButtonCerdoPlato)
        imageButtonCerdoPlato.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.cerdo
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido CARNE
        var imageButtonCarne = findViewById<ImageButton>(R.id.imageButtonCarne)
        imageButtonCarne.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.carne
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido MARISCO
        var imageButtonMarisco = findViewById<ImageButton>(R.id.imageButtonMarisco)
        imageButtonMarisco.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.marisco
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido PESCADO
        var imageButtonPescado = findViewById<ImageButton>(R.id.imageButtonPescado)
        imageButtonPescado.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.pescado
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido HUEVOS
        var imageButtonHuevos = findViewById<ImageButton>(R.id.imageButtonHuevos)
        imageButtonHuevos.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.huevos
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido PATATAS FRITAS
        var imageButtonPatatasFritas = findViewById<ImageButton>(R.id.imageButtonPatatasFritas)
        imageButtonPatatasFritas.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.patatas_fritas
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido PASTA
        var imageButtonPastaPlato = findViewById<ImageButton>(R.id.imageButtonPastaPlato)
        imageButtonPastaPlato.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.pasta
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido ARROZ
        var imageButtonArroz = findViewById<ImageButton>(R.id.imageButtonArroz)
        imageButtonArroz.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.arroz
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido PURE
        var imageButtonPure = findViewById<ImageButton>(R.id.imageButtonPure)
        imageButtonPure.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.pure
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido VERDURAS
        var imageButtonVerduras = findViewById<ImageButton>(R.id.imageButtonVerduras)
        imageButtonVerduras.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.verdura
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido PAN
        var imageButtonPan = findViewById<ImageButton>(R.id.imageButtonPan)
        imageButtonPan.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.pan
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido PIZZA
        var imageButtonPizza = findViewById<ImageButton>(R.id.imageButtonPizza)
        imageButtonPizza.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.pizza
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido SANDWICH
        var imageButtonSandwich = findViewById<ImageButton>(R.id.imageButtonSandwich)
        imageButtonSandwich.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.sandwich
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido HAMBURGUESA
        var imageButtonHamburguesa = findViewById<ImageButton>(R.id.imageButtonHamburguesa)
        imageButtonHamburguesa.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.hamburgesa
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido MANTEQUILLA
        var imageButtonMantequilla = findViewById<ImageButton>(R.id.imageButtonMantequilla)
        imageButtonMantequilla.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.mantequilla
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido SALSA KETCHUP
        var imageButtonSalsaKetchup = findViewById<ImageButton>(R.id.imageButtonSalsaKetchup)
        imageButtonSalsaKetchup.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.salsa_ketchup
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido SAL
        var imageButtonSal = findViewById<ImageButton>(R.id.imageButtonSal)
        imageButtonSal.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.sal
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