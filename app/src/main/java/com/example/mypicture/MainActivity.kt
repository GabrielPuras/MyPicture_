package com.example.mypicture

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageButton



class MainActivity : AppCompatActivity() {

    // Botón imagen PERSONAS
    lateinit var imageButtonPersonas: ImageButton

    // Boton imagen ESTADOS ANIMO
    lateinit var imageButtonEstadoAnimo: ImageButton

    // Boton imagen PARTES CUERPO
    lateinit var imageButtonPartesCuerpo: ImageButton

    // Botón imagen VERBOS
    lateinit var imageButtonVerbos: ImageButton

    // Botón imagen FRASES HECHAS
    lateinit var imageButtonFrasesHechas: ImageButton

    // Botón imagen BEBIDAS
    lateinit var imageButtonBebidas: ImageButton

    // Botón imagen COMIDA
    lateinit var imageButtonComida: ImageButton

    // Botón imagen GUSTOS
    lateinit var imageButtonGustos: ImageButton

    // Botón imagen NECESIDADES
    lateinit var imageButtonNecesidades: ImageButton

    // Botón imagen HOGAR
    lateinit var imageButtonHogar: ImageButton

    // Botón imagen ROPA
    lateinit var imageButtonRopa: ImageButton

    // Botón imagen Conceptos
    lateinit var imageButtonConceptos: ImageButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Prueba Sonido QUIERO
        var imageButtonQuiero = findViewById<ImageButton>(R.id.imageButtonQuiero)
        imageButtonQuiero.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.quiero_audio
            ) // Sonido QUIERO
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }


        // Prueba Sonido YO
        var imageButtonYo = findViewById<ImageButton>(R.id.imageButtonYo)
        imageButtonYo.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.yo
            ) // Sonido YO
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Prueba Sonido SI
        var imageButtonSi = findViewById<ImageButton>(R.id.imageButtonSi)
        imageButtonSi.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.si
            ) // Sonido SI
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }


        // Prueba Sonido NO
        var imageButtonNo = findViewById<ImageButton>(R.id.imageButtonNo)
        imageButtonNo.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.no
            ) // Sonido No
            mediaPlayer.start()

            // Libera los recursos del MediaPlayer una vez que el sonido haya terminado de reproducirse
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }


        ///////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////


        // Inicializar el ImageButton
        imageButtonVerbos = findViewById(R.id.imageButtonVerbos)

        // Agregar un OnClickListener al ImageButton
        imageButtonVerbos.setOnClickListener {
            // Reproducir el sonido "verbos"
            val mediaPlayer = MediaPlayer.create(this, R.raw.verbos)
            mediaPlayer.start()

            // Llevar al usuario a la Activity
            val intent = Intent(this, VerbosActivity::class.java)
            startActivity(intent)
        }

        // Inicializar el ImageButton
        imageButtonPartesCuerpo = findViewById(R.id.imageButtonPartesCuerpo)

        // Agregar un OnClickListener al ImageButton
        imageButtonPartesCuerpo.setOnClickListener {
            // Reproducir el sonido "partes_cuerpo"
            val mediaPlayer = MediaPlayer.create(this, R.raw.partes_cuerpo)
            mediaPlayer.start()

            // Llevar al usuario a la Activity
            val intent = Intent(this, PartesCuerpoActivity::class.java)
            startActivity(intent)
        }

        // Inicializar el ImageButton
        imageButtonEstadoAnimo = findViewById(R.id.imageButtonEstadoAnimo)

        // Agregar un OnClickListener al ImageButton
        imageButtonEstadoAnimo.setOnClickListener {
            // Reproducir el sonido "estado_animo"
            val mediaPlayer = MediaPlayer.create(this, R.raw.estados_de_animos)
            mediaPlayer.start()

            // Llevar al usuario a la Activity
            val intent = Intent(this, EstadosAnimoActivity::class.java)
            startActivity(intent)
        }

        // Inicializar el ImageButton
        imageButtonFrasesHechas = findViewById(R.id.imageButtonFrasesHechas)

        // Agregar un OnClickListener al ImageButton
        imageButtonFrasesHechas.setOnClickListener {
            // Reproducir el sonido "frases_hechas"
            val mediaPlayer = MediaPlayer.create(this, R.raw.frases_hechas)
            mediaPlayer.start()

            // Llevar al usuario a la Activity
            val intent = Intent(this, FrasesHechasActivity::class.java)
            startActivity(intent)
        }

        // Inicializar el ImageButton
        imageButtonPersonas = findViewById(R.id.imageButtonPersonas)

        // Agregar un OnClickListener al ImageButton
        imageButtonPersonas.setOnClickListener {
            // Reproducir el sonido "personas"
            val mediaPlayer = MediaPlayer.create(this, R.raw.personas)
            mediaPlayer.start()

            // Llevar al usuario a la Activity
            val intent = Intent(this, PersonasActivity::class.java)
            startActivity(intent)
        }

        // Inicializar el ImageButton
        imageButtonComida = findViewById(R.id.imageButtonComida)

        // Agregar un OnClickListener al ImageButton
        imageButtonComida.setOnClickListener {
            // Reproducir el sonido "comida"
            val mediaPlayer = MediaPlayer.create(this, R.raw.comida)
            mediaPlayer.start()

            // Llevar al usuario a la Activity
            val intent = Intent(this, ComidaActivity::class.java)
            startActivity(intent)
        }

        // Inicializar el ImageButton
        imageButtonBebidas = findViewById(R.id.imageButtonBebidas)

        // Agregar un OnClickListener al ImageButton
        imageButtonBebidas.setOnClickListener {
            // Reproducir el sonido "Bebidas"
            val mediaPlayer = MediaPlayer.create(this, R.raw.bebidas)
            mediaPlayer.start()

            // Llevar al usuario a la Activity
            val intent = Intent(this, BebidasActivity::class.java)
            startActivity(intent)
        }

        // Inicializar el ImageButton
        imageButtonGustos = findViewById(R.id.imageButtonGustos)

        // Agregar un OnClickListener al ImageButton
        imageButtonGustos.setOnClickListener {
            // Reproducir el sonido "gustos_actividades"
            val mediaPlayer = MediaPlayer.create(this, R.raw.gustos_actividades)
            mediaPlayer.start()

            // Llevar al usuario a la Activity
            val intent = Intent(this, GustosActividadesActivity::class.java)
            startActivity(intent)
        }

        // Inicializar el ImageButton
        imageButtonNecesidades = findViewById(R.id.imageButtonNecesidades)

        // Agregar un OnClickListener al ImageButton
        imageButtonNecesidades.setOnClickListener {
            // Reproducir el sonido "necesidades"
            val mediaPlayer = MediaPlayer.create(this, R.raw.necesidades)
            mediaPlayer.start()

            // Llevar al usuario a la Activity
            val intent = Intent(this, NecesidadesActivity::class.java)
            startActivity(intent)
        }

        // Inicializar el ImageButton
        imageButtonHogar = findViewById(R.id.imageButtonHogar)

        // Agregar un OnClickListener al ImageButton
        imageButtonHogar.setOnClickListener {
            // Reproducir el sonido "hogar"
            val mediaPlayer = MediaPlayer.create(this, R.raw.hogar)
            mediaPlayer.start()

            // Llevar al usuario a la Activity
            val intent = Intent(this, HogarActivity::class.java)
            startActivity(intent)
        }

        // Inicializar el ImageButton
        imageButtonRopa = findViewById(R.id.imageButtonRopa)

        // Agregar un OnClickListener al ImageButton
        imageButtonRopa.setOnClickListener {
            // Reproducir el sonido "ropa"
            val mediaPlayer = MediaPlayer.create(this, R.raw.ropa)
            mediaPlayer.start()

            // Llevar al usuario a la Activity
            val intent = Intent(this, RopaActivity::class.java)
            startActivity(intent)
        }

        // Inicializar el ImageButton
        imageButtonConceptos = findViewById(R.id.imageButtonConceptos)

        // Agregar un OnClickListener al ImageButton
        imageButtonConceptos.setOnClickListener {
            // Reproducir el sonido "conceptos"
            val mediaPlayer = MediaPlayer.create(this, R.raw.conceptos)
            mediaPlayer.start()

            // Llevar al usuario a la Activity
            val intent = Intent(this, ConceptosActivity::class.java)
            startActivity(intent)
        }




    }
}














