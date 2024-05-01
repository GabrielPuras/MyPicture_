package com.example.mypicture

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class VerbosDosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verbos_dos)


        // Sonido VER
        var imageButtonVer = findViewById<ImageButton>(R.id.imageButtonVer)
        imageButtonVer.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.ver
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido LIMPIAR
        var imageButtonLimpiar = findViewById<ImageButton>(R.id.imageButtonLimpiar)
        imageButtonLimpiar.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.limpiar
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido PARTICIPAR
        var imageButtonParticipar = findViewById<ImageButton>(R.id.imageButtonParticipar)
        imageButtonParticipar.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.participar
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido Morir
        var imageButtonMorir = findViewById<ImageButton>(R.id.imageButtonMorir)
        imageButtonMorir.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.morir
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido OLER
        var imageButtonOler = findViewById<ImageButton>(R.id.imageButtonOler)
        imageButtonOler.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.oler
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido PONER
        var imageButtonPoner = findViewById<ImageButton>(R.id.imageButtonPoner)
        imageButtonPoner.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.poner
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido ROMPER
        var imageButtonRomper = findViewById<ImageButton>(R.id.imageButtonRomper)
        imageButtonRomper.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.romper
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido QUITAR
        var imageButtonQuitar = findViewById<ImageButton>(R.id.imageButtonQuitar)
        imageButtonQuitar.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.quitar
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido TRAER
        var imageButtonTraer = findViewById<ImageButton>(R.id.imageButtonTraer)
        imageButtonTraer.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.traer
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido TENER
        var imageButtonTener = findViewById<ImageButton>(R.id.imageButtonTener)
        imageButtonTener.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.tener
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido SUBIR
        var imageButtonSubir = findViewById<ImageButton>(R.id.imageButtonSubir)
        imageButtonSubir.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.subir
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido SER
        var imageButtonSer = findViewById<ImageButton>(R.id.imageButtonSer)
        imageButtonSer.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.ser
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido SALIR
        var imageButtonSalir = findViewById<ImageButton>(R.id.imageButtonSalir)
        imageButtonSalir.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.salir
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido VESTIR
        var imageButtonVestir = findViewById<ImageButton>(R.id.imageButtonVestir)
        imageButtonVestir.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.vestir
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido VIVIR
        var imageButtonVivir = findViewById<ImageButton>(R.id.imageButtonVivir)
        imageButtonVivir.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.vivir
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido COCINAR
        var imageButtonCocinar = findViewById<ImageButton>(R.id.imageButtonCocinar)
        imageButtonCocinar.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.cocinar
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido VIAJAR
        var imageButtonViajar = findViewById<ImageButton>(R.id.imageButtonViajar)
        imageButtonViajar.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.viajar
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido SENTIR
        var imageButtonSentir = findViewById<ImageButton>(R.id.imageButtonSentir)
        imageButtonSentir.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.sentir
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