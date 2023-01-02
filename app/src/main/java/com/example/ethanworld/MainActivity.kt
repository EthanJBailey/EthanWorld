package com.example.ethanworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.clickMeButton)
        button.setOnClickListener{
            Log.v( "Click Me!", "Button clicked!")
            Toast.makeText(this, "Time to Fly Away!", Toast.LENGTH_SHORT).show()
        }
    }
}