package com.example.glsurfaceviewtest

import android.content.Context
import android.opengl.GLSurfaceView
import android.view.SurfaceHolder
import android.view.View

class MyGLView(context: Context?) : GLSurfaceView(context) {
    private val renderer: MyRenderer = MyRenderer(this)

    init {
        systemUiVisibility = (
                View.SYSTEM_UI_FLAG_FULLSCREEN or
                        View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                )

        setRenderer(renderer)
    }

    override fun surfaceCreated(holder: SurfaceHolder?) {
        super.surfaceCreated(holder)
    }
}