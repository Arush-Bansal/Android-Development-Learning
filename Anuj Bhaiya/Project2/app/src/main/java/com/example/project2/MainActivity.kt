package com.example.project2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Config.DEBUG
import android.util.Log
import android.util.Log.DEBUG
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.bumptech.glide.Glide
import com.example.project2.BuildConfig.DEBUG


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun nextMeme(view: View) {}
    fun shareMeme(view: View) {
        // Instantiate the RequestQueue.
        val queue = Volley.newRequestQueue(this)
        val url = "https://picsum.photos/500/300?random=1"
        val imgMeme = findViewById<ImageView>(R.id.imageMeme)
        val jsonObjectRequest = JsonObjectRequest(Request.Method.GET, url, null,
            Response.Listener { response ->
                var imgUrl = response.getString("preview")
                Glide.with(this).load(imgUrl[0]).into(imgMeme)
            },
            Response.ErrorListener { error ->
                Log.d("error", error.toString())
            }
        )
        queue.add(jsonObjectRequest)
    }
}