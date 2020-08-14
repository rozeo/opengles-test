package com.example.glsurfaceviewtest

import android.opengl.GLES32
import android.opengl.GLSurfaceView
import android.util.Log
import com.example.glsurfaceviewtest.components.Triangle
import com.example.glsurfaceviewtest.components.Vector3
import com.example.glsurfaceviewtest.components.Vertex
import javax.microedition.khronos.egl.EGLConfig
import javax.microedition.khronos.opengles.GL10

class MyRenderer(_view: GLSurfaceView) : GLSurfaceView.Renderer {
    private val view: GLSurfaceView = _view
    private val tri: Triangle = Triangle(
        Vector3(Vertex(0.0, 0.0, 0.0), 1.0, 1.0, 1.0),
        Vector3(Vertex(1.0, 1.0, 0.0), 1.0, 1.0, 1.0),
        Vector3(Vertex(0.0, 1.0, 1.0), 1.0, 1.0, 1.0)
    )

    override fun onDrawFrame(gl: GL10?) {
        GLES32.glClear(GLES32.GL_COLOR_BUFFER_BIT)
        tri.move(Vertex(1.0, 1.0, 1.0))
        Log.d("debug", tri.toString())
    }

    override fun onSurfaceChanged(gl: GL10?, width: Int, height: Int) {
        GLES32.glViewport(0, 0, width, height)
    }

    override fun onSurfaceCreated(gl: GL10?, config: EGLConfig?) {
        GLES32.glClearColor(1.0f, 1.0f, 1.0f, 1.0f)
    }
}