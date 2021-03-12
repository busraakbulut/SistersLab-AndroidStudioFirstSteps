package com.example.sisterslab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private lateinit var editTextTextPersonName  :EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName)


    }
    fun sayHello(view: View) {
        val username = editTextTextPersonName.text
        val message = "Merhaba " + editTextTextPersonName.text + "!"
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        val intent = Intent (this@MainActivity, Sisterslab3::class.java)

      intent.putExtra("username", username.toString())
        startActivity(intent);

    }

}