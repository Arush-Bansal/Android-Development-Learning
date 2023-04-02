package com.example.project1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthdayCard(view: View) {

        val name = name_input_text.text.toString()
        Toast.makeText(this, "hello there $name", Toast.LENGTH_LONG).show()

        val intent = Intent(this, CardCreated::class.java)
        intent.putExtra(CardCreated.NAME_EXTRA, name)
        startActivity(intent)
    }
}