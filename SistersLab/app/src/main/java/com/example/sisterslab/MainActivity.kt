package com.example.sisterslab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
        fun sayHello(view: View) {
            Toast.makeText(this, "HELLLLOO WORLDD :)", Toast.LENGTH_LONG).show()


        }

    }