package com.nandini.themechanger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonlight = findViewById<Button>(R.id.btnlight)
        val buttondark = findViewById<Button>(R.id.btndark)
        val layout = findViewById<ConstraintLayout>(R.id.constraintlayout)

        buttonlight.setOnClickListener {

            Toast.makeText(applicationContext,"changing...",Toast.LENGTH_SHORT).show()
            layout.setBackgroundResource(R.color.white)
        }
        buttondark.setOnClickListener {
            Toast.makeText(applicationContext,"changing...",Toast.LENGTH_SHORT).show()
            layout.setBackgroundResource(R.color.black)
        }
    }
}