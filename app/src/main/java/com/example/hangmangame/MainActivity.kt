package com.example.hangmangame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.hangmangame.GameActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val playButton: Button = findViewById(R.id.play_button)
        playButton.setOnClickListener {
            val intent = Intent(this, GameActivity::class.java)
            startActivity(intent)
        }

    }
}