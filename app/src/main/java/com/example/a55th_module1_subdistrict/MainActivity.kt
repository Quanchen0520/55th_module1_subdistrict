package com.example.a55th_module1_subdistrict

import android.content.Intent
import android.os.Bundle
import android.text.Layout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val musicListBtn = findViewById<ConstraintLayout>(R.id.constraintlayout)
        musicListBtn.setOnClickListener {
            val intent = Intent(this,MusicPlayerActivity::class.java)
            startActivity(intent)
        }
    }
}