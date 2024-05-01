package com.example.mypicture

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class DeportesGustosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deportes_gustos)

        // Sonido RUGBY
        var imageButtonRugby = findViewById<ImageButton>(R.id.imageButtonRugby)
        imageButtonRugby.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.rugby
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido BALONCESTO
        var imageButtonBaloncesto = findViewById<ImageButton>(R.id.imageButtonBaloncesto)
        imageButtonBaloncesto.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.baloncesto
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido VOLEIBOL
        var imageButtonVoleibol = findViewById<ImageButton>(R.id.imageButtonVoleibol)
        imageButtonVoleibol.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.voleibol
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido TENIS
        var imageButtonTenis = findViewById<ImageButton>(R.id.imageButtonTenis)
        imageButtonTenis.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.tenis
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido BALONMANO
        var imageButtonBalonmano = findViewById<ImageButton>(R.id.imageButtonBalonmano)
        imageButtonBalonmano.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.balonmano
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido HOCKEY
        var imageButtonHockey = findViewById<ImageButton>(R.id.imageButtonHockey)
        imageButtonHockey.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.hockey
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido FUTBOL
        var imageButtonFutbol = findViewById<ImageButton>(R.id.imageButtonFutbol)
        imageButtonFutbol.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.futbol
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido ATLETISMO
        var imageButtonAtletismo = findViewById<ImageButton>(R.id.imageButtonAtletismo)
        imageButtonAtletismo.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.atletismo
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido CICLISMO
        var imageButtonCiclismo = findViewById<ImageButton>(R.id.imageButtonCiclismo)
        imageButtonCiclismo.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.ciclismo
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido BOXEO
        var imageButtonBoxeo = findViewById<ImageButton>(R.id.imageButtonBoxeo)
        imageButtonBoxeo.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.boxeo
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido NATACION
        var imageButtonNatacion = findViewById<ImageButton>(R.id.imageButtonNatacion)
        imageButtonNatacion.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.natacion
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido MOTO GP
        var imageButtonMotoGp = findViewById<ImageButton>(R.id.imageButtonMotoGp)
        imageButtonMotoGp.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.moto_gp
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido GIMNASIA RITMICA
        var imageButtonGimnasiaRitmica = findViewById<ImageButton>(R.id.imageButtonGimnasiaRitmica)
        imageButtonGimnasiaRitmica.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.gimnasia
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido HIPICA
        var imageButtonHipica = findViewById<ImageButton>(R.id.imageButtonHipica)
        imageButtonHipica.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.hipica
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido F1
        var imageButtonF1 = findViewById<ImageButton>(R.id.imageButtonF1)
        imageButtonF1.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.f1
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido REMO
        var imageButtonRemo = findViewById<ImageButton>(R.id.imageButtonRemo)
        imageButtonRemo.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.remo
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido ESGRIMA
        var imageButtonEsgrima = findViewById<ImageButton>(R.id.imageButtonEsgrima)
        imageButtonEsgrima.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.esgrima
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido TENIS MESA
        var imageButtonTenisMesa = findViewById<ImageButton>(R.id.imageButtonTenisMesa)
        imageButtonTenisMesa.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.tenis_mesa
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