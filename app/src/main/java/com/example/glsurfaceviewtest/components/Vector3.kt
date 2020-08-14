package com.example.glsurfaceviewtest.components

import kotlin.math.sqrt

class Vector3(
    val vertex: Vertex,
    var x: Double,
    var y: Double,
    var z: Double
) {
    companion object {
        public fun makeWithVertex(v1: Vertex, v2: Vertex): Vector3 {
            return Vector3(
                v1, v2.x, v2.y, v2.z
            )
        }
    }

    public fun length(): Double {
        return sqrt(x * x + y * y + z * z)
    }

    public fun add(lx: Double, ly: Double, lz: Double): Vector3 {
        x += lx
        y += ly
        z += lz
        return this
    }

    public fun normalize(): Vector3 {
        val mult: Double = length()

        return Vector3(
            vertex,
            x / mult,
            y / mult,
            z / mult
        )
    }

    override fun toString(): String {
        return "Vertex: " +
                vertex.x + " " +
                vertex.y + " " +
                vertex.z + " " +
                "\n" +
                x + " " +
                y + " " +
                z + " " +
                length()
        ;
    }
}