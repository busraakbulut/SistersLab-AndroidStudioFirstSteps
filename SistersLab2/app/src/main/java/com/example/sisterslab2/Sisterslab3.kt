package com.example.sisterslab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_sisterslab3.*
import android.widget.TextView


class Sisterslab3 : AppCompatActivity() {
    private lateinit var userNameTextView  : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sisterslab3)


        userNameTextView  = findViewById(R.id.userNameTextView)
        val intent = intent
        val name = intent.getStringExtra("username")
        userNameTextView.text = "My name is " + name


    }

}