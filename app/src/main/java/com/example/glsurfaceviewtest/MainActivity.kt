package com.example.glsurfaceviewtest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var view: MyGLView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        view = MyGLView(this)

        super.onCreate(savedInstanceState)
        setContentView(view)

        supportActionBar?.hide()
    }
}