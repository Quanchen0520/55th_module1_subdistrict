package com.example.a55th_module1_subdistrict

import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MusicPlayerActivity : AppCompatActivity() {
    var isplaying = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_music_player)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val backBtn = findViewById<ImageButton>(R.id.backBtn)
        backBtn.setOnClickListener {
            finish()
        }
        val playBtn = findViewById<ImageButton>(R.id.playBtn)
        playBtn.setOnClickListener {
            isplaying = if (isplaying){
                playBtn.setImageResource(R.drawable.outline_play_arrow_24)
                !isplaying
            } else{
                playBtn.setImageResource(R.drawable.sharp_pause_24)
                !isplaying
            }
        }
    }
}