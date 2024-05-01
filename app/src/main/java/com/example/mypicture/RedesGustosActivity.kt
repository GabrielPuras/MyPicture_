package com.example.mypicture

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class RedesGustosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_redes_gustos)

        // Sonido FACEBOOK
        var imageButtonFacebook = findViewById<ImageButton>(R.id.imageButtonFacebook)
        imageButtonFacebook.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.facebook
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido YOUTUBE
        var imageButtonYoutube = findViewById<ImageButton>(R.id.imageButtonYoutube)
        imageButtonYoutube.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.youtube
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido INSTAGRAM
        var imageButtonInstagram = findViewById<ImageButton>(R.id.imageButtonInstagram)
        imageButtonInstagram.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.instragram
            )
            mediaPlayer.start()

            mediaPlayer.setOnCompletionListener {
                mediaPlayer.release()
            }
        }

        // Sonido WHATSAPP
        var imageButtonWhatsapp = findViewById<ImageButton>(R.id.imageButtonWhatsapp)
        imageButtonWhatsapp.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(
                this,
                R.raw.whatsapp
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