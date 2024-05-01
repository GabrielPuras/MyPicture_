package com.example.mypicture

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class RopaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ropa)


        // Prueba Sonido PANTALON
        var imageButtonPantalon = findViewById<ImageButton>(R.id.imageButtonPantalon)
        imageButtonPantalon.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.pantalon
            ) // Sonido PANTALON
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido PANTALONES CORTOS
        var imageButtonPantalonCorto = findViewById<ImageButton>(R.id.imageButtonPantalonCorto)
        imageButtonPantalonCorto.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.pantalones_cortos
            ) // Sonido PANTALON CORTOS
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido CAMISA
        var imageButtonCamisa = findViewById<ImageButton>(R.id.imageButtonCamisa)
        imageButtonCamisa.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.camisa
            ) // Sonido CAMISA
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido CAMISETA
        var imageButtonCamiseta = findViewById<ImageButton>(R.id.imageButtonCamiseta)
        imageButtonCamiseta.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.camiseta
            ) // Sonido CAMISETA
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido SUDADERA
        var imageButtonSudadera = findViewById<ImageButton>(R.id.imageButtonSudadera)
        imageButtonSudadera.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.sudadera
            ) // Sonido SUDADERA
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido CHAQUETA
        var imageButtonChaqueta = findViewById<ImageButton>(R.id.imageButtonChaqueta)
        imageButtonChaqueta.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.chaqueta
            ) // Sonido CHAQUETA
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido ROPA INTERIOR
        var imageButtonRopaInterior = findViewById<ImageButton>(R.id.imageButtonRopaInterior)
        imageButtonRopaInterior.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.ropa_interior
            ) // Sonido ROPA INTERIOR
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido CALCETINES
        var imageButtonCalcetines = findViewById<ImageButton>(R.id.imageButtonCalcetines)
        imageButtonCalcetines.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.calcetines
            ) // Sonido CALCETINES
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido GORRO
        var imageButtonGorro = findViewById<ImageButton>(R.id.imageButtonGorro)
        imageButtonGorro.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.gorro
            ) // Sonido GORRO
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido BOLSA
        var imageButtonBolsa = findViewById<ImageButton>(R.id.imageButtonBolsa)
        imageButtonBolsa.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.bolsa
            ) // Sonido BOLSA
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido GUANTES
        var imageButtonGuantes = findViewById<ImageButton>(R.id.imageButtonGuantes)
        imageButtonGuantes.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.guantes
            ) // Sonido GUANTES
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido PIJAMA
        var imageButtonPijama = findViewById<ImageButton>(R.id.imageButtonPijama)
        imageButtonPijama.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.pijama
            ) // Sonido PIJAMA
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido BANADOR
        var imageButtonBanador = findViewById<ImageButton>(R.id.imageButtonBanador)
        imageButtonBanador.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.banador
            ) // Sonido BANADOR
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido BUFANDA
        var imageButtonBufanda = findViewById<ImageButton>(R.id.imageButtonBufanda)
        imageButtonBufanda.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.bufanda
            ) // Sonido BUFANDA
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido ZAPATO
        var imageButtonZapato = findViewById<ImageButton>(R.id.imageButtonZapato)
        imageButtonZapato.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.zapato
            ) // Sonido ZAPATO
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido ZAPATILLAS
        var imageButtonZapatillas = findViewById<ImageButton>(R.id.imageButtonZapatillas)
        imageButtonZapatillas.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.zapatillas
            ) // Sonido ZAPATILLAS
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido CHANDAL
        var imageButtonChandal = findViewById<ImageButton>(R.id.imageButtonChandal)
        imageButtonChandal.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.chandal
            ) // Sonido CHANDAL
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido GAFAS
        var imageButtonGafas = findViewById<ImageButton>(R.id.imageButtonGafas)
        imageButtonGafas.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.gafas
            ) // Sonido GAFAS
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