package com.example.myfirstapplication
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
    lateinit var button1 : Button
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1=findViewById<Button>(R.id.button1)

        button1.setOnClickListener{
            val show = Toast.makeText(
                applicationContext,
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}