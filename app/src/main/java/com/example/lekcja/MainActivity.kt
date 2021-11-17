package com.example.lekcja

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import java.util.jar.Attributes

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn1).setOnClickListener {
            findViewById<EditText>(R.id.editText1).setText("Joachim Psuty-Lipski");
        }
        findViewById<Button>(R.id.btn2).setOnClickListener {
            findViewById<EditText>(R.id.editTextTextMultiLine).setText(getString(R.string.napis));
        }
    }
}