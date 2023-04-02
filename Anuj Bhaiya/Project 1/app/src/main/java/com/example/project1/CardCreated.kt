package com.example.project1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_card_created.*

class CardCreated : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA = "name_extra"
    }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_created)

        val name = intent.getStringExtra(NAME_EXTRA)
        happyBirthdayText.text = "Happy Birthday $name!"
    }
}