package com.example.mypicture

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class PartesCuerpoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_partes_cuerpo)


        // Prueba Sonido PIERNA
        var imageButtonPierna = findViewById<ImageButton>(R.id.imageButtonPierna)
        imageButtonPierna.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.pierna
            ) // Sonido PIERNA
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido PIE
        var imageButtonPie = findViewById<ImageButton>(R.id.imageButtonPie)
        imageButtonPie.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.pie
            ) // Sonido PIE
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido MANO
        var imageButtonMano = findViewById<ImageButton>(R.id.imageButtonMano)
        imageButtonMano.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.mano
            ) // Sonido MANO
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido BRAZO
        var imageButtonBrazo = findViewById<ImageButton>(R.id.imageButtonBrazo)
        imageButtonBrazo.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.brazo
            ) // Sonido BRAZO
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido DEDO
        var imageButtonDedo = findViewById<ImageButton>(R.id.imageButtonDedo)
        imageButtonDedo.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.dedo
            ) // Sonido DEDO
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido VIENTRE
        var imageButtonVientre = findViewById<ImageButton>(R.id.imageButtonVientre)
        imageButtonVientre.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.panza_vientre
            ) // Sonido VIENTRE
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido PECHO
        var imageButtonPecho = findViewById<ImageButton>(R.id.imageButtonPecho)
        imageButtonPecho.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.pecho
            ) // Sonido PECHO
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido ESPALDA
        var imageButtonEspalda = findViewById<ImageButton>(R.id.imageButtonEspalda)
        imageButtonEspalda.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.espalda
            ) // Sonido ESPALDA
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido CULO
        var imageButtonCulo = findViewById<ImageButton>(R.id.imageButtonCulo)
        imageButtonCulo.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.culo
            ) // Sonido CULO
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido CARA
        var imageButtonCara = findViewById<ImageButton>(R.id.imageButtonCara)
        imageButtonCara.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.cara
            ) // Sonido CARA
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido CUELLO
        var imageButtonCuello = findViewById<ImageButton>(R.id.imageButtonCuello)
        imageButtonCuello.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.cuello
            ) // Sonido CUELLO
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido PELO
        var imageButtonPelo = findViewById<ImageButton>(R.id.imageButtonPelo)
        imageButtonPelo.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.pelo
            ) // Sonido PELO
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido Nariz
        var imageButtonNariz = findViewById<ImageButton>(R.id.imageButtonNariz)
        imageButtonNariz.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.nariz
            ) // Sonido NARIZ
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido OJO
        var imageButtonOjo = findViewById<ImageButton>(R.id.imageButtonOjo)
        imageButtonOjo.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.ojo
            ) // Sonido OJO
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido LENGUA
        var imageButtonLengua = findViewById<ImageButton>(R.id.imageButtonLengua)
        imageButtonLengua.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.lengua
            ) // Sonido LENGUA
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido DIENTE
        var imageButtonDiente = findViewById<ImageButton>(R.id.imageButtonDiente)
        imageButtonDiente.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.diente
            ) // Sonido DIENTE
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido BOCA
        var imageButtonBoca = findViewById<ImageButton>(R.id.imageButtonBoca)
        imageButtonBoca.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.boca
            ) // Sonido BOCA
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