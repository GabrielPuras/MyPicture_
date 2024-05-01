package com.example.mypicture

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class EstadosAnimoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estados_animo)


        // Sonido CONTENTO
        var imageButtonContento = findViewById<ImageButton>(R.id.imageButtonContento)
        imageButtonContento.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.contento
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido TRISTE
        var imageButtonTriste = findViewById<ImageButton>(R.id.imageButtonTriste)
        imageButtonTriste.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.triste
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido ASUSTADO
        var imageButtonAsustado = findViewById<ImageButton>(R.id.imageButtonAsustado)
        imageButtonAsustado.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.asutado
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido ENFADADO
        var imageButtonEnfadado = findViewById<ImageButton>(R.id.imageButtonEnfadado)
        imageButtonEnfadado.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.enfado
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido NERVIOSO
        var imageButtonNervioso = findViewById<ImageButton>(R.id.imageButtonNervioso)
        imageButtonNervioso.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.nervioso
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido OGULLOSO
        var imageButtonOrgulloso = findViewById<ImageButton>(R.id.imageButtonOrgulloso)
        imageButtonOrgulloso.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.orgulloso
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido ABURRIDO
        var imageButtonAburrido = findViewById<ImageButton>(R.id.imageButtonAburrido)
        imageButtonAburrido.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.aburrido
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido VERGUENZA
        var imageButtonVerguenza = findViewById<ImageButton>(R.id.imageButtonVerguenza)
        imageButtonVerguenza.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.verguenza
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido CURIOSO
        var imageButtonCurioso = findViewById<ImageButton>(R.id.imageButtonCurioso)
        imageButtonCurioso.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.curioso
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido ASCO
        var imageButtonAsco = findViewById<ImageButton>(R.id.imageButtonAsco)
        imageButtonAsco.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.asco
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido PREOCUPADO
        var imageButtonPreocupado = findViewById<ImageButton>(R.id.imageButtonPreocupado)
        imageButtonPreocupado.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.preocupado
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido CANSADO
        var imageButtonCansado = findViewById<ImageButton>(R.id.imageButtonCansado)
        imageButtonCansado.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.cansado
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido SERIO
        var imageButtonSerio = findViewById<ImageButton>(R.id.imageButtonSerio)
        imageButtonSerio.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.serio
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido ENCANTADO
        var imageButtonEncantado = findViewById<ImageButton>(R.id.imageButtonEncantado)
        imageButtonEncantado.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.encantado
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido CONFUSO
        var imageButtonConfuso = findViewById<ImageButton>(R.id.imageButtonConfuso)
        imageButtonConfuso.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.confuso
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido TRANQUILO
        var imageButtonTranquilo = findViewById<ImageButton>(R.id.imageButtonTranquilo)
        imageButtonTranquilo.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.tranquilo
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido ENAMORADO
        var imageButtonEnamorado = findViewById<ImageButton>(R.id.imageButtonEnamorado)
        imageButtonEnamorado.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.enamorado
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido TIMIDO
        var imageButtonTimido = findViewById<ImageButton>(R.id.imageButtonTimido)
        imageButtonTimido.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.timido
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