package com.example.mypicture

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class VerbosActivity : AppCompatActivity() {


    // Botón imagen VERBOS
    lateinit var imageButtonMas: ImageButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verbos)

        // Prueba Sonido HACER
        var imageButtonHacer = findViewById<ImageButton>(R.id.imageButtonHacer)
        imageButtonHacer.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.hacer
            ) // Sonido HACER
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido DORMIR
        var imageButtonDormir = findViewById<ImageButton>(R.id.imageButtonDormir)
        imageButtonDormir.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.dormir
            ) // Sonido DORMIR
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido IR
        var imageButtonIr = findViewById<ImageButton>(R.id.imageButtonIr)
        imageButtonIr.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.ir
            ) // Sonido IR
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido HABLAR
        var imageButtonHablar = findViewById<ImageButton>(R.id.imageButtonHablar)
        imageButtonHablar.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.hablar
            ) // Sonido IR
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido ENTENDER
        var imageButtonEntender = findViewById<ImageButton>(R.id.imageButtonEntender)
        imageButtonEntender.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.entender
            ) // Sonido ENTENDER
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido ELEGIR
        var imageButtonElegir = findViewById<ImageButton>(R.id.imageButtonElegir)
        imageButtonElegir.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.elegir
            ) // Sonido ELEGIR
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido JUGAR
        var imageButtonJugar = findViewById<ImageButton>(R.id.imageButtonJugar)
        imageButtonJugar.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.jugar
            ) // Sonido JUGAR
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido CANTAR
        var imageButtonCantar = findViewById<ImageButton>(R.id.imageButtonCantar)
        imageButtonCantar.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.cantar
            ) // Sonido CANTAR
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido GRABAR
        var imageButtonGrabar = findViewById<ImageButton>(R.id.imageButtonGrabar)
        imageButtonGrabar.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.grabar
            ) // Sonido GRABAR
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        //Prueba Sonido EXPLICAR
        var imageButtonExplicar = findViewById<ImageButton>(R.id.imageButtonExplicar)
        imageButtonExplicar.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.explicar
            ) // Sonido EXPLICAR
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido CAER
        var imageButtonCaer = findViewById<ImageButton>(R.id.imageButtonCaer)
        imageButtonCaer.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.caer
            ) // Sonido CAER
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido BAJAR
        var imageButtonBajar = findViewById<ImageButton>(R.id.imageButtonBajar)
        imageButtonBajar.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.bajar
            ) // Sonido BAJAR
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido ESCUCHAR
        var imageButtonEscuchar = findViewById<ImageButton>(R.id.imageButtonEscuchar)
        imageButtonEscuchar.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.escuchar
            ) // Sonido ESCUCHAR
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido ESPERAR
        var imageButtonEsperar = findViewById<ImageButton>(R.id.imageButtonEsperar)
        imageButtonEsperar.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.esperar
            ) // Sonido ESPERAR
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido ESTAR
        var imageButtonEstar = findViewById<ImageButton>(R.id.imageButtonEstar)
        imageButtonEstar.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.estar
            ) // Sonido ESTAR
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido COMPRAR
        var imageButtonComprar = findViewById<ImageButton>(R.id.imageButtonComprar)
        imageButtonComprar.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.comprar
            ) // Sonido COMPRAR
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido CORRER
        var imageButtonCorrer = findViewById<ImageButton>(R.id.imageButtonCorrer)
        imageButtonCorrer.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.correr
            ) // Sonido CORRER
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }





        // Inicializar el ImageButton
        imageButtonMas = findViewById(R.id.imageButtonMas)

        // Agregar un OnClickListener al ImageButton
        imageButtonMas.setOnClickListener {
            // Llevar al usuario a la Activity
            val intent = Intent(this, VerbosDosActivity::class.java)
            startActivity(intent)
        }





    }

    fun volverAMainActivity(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
