package com.example.glsurfaceviewtest.components

class Vertex(
    var x: Double,
    var y: Double,
    var z: Double
) {
    public final operator fun plus(v: Vertex): Vertex {
        return add(v)
    }

    public final operator fun minus(v: Vertex): Vertex {
        return sub(v)
    }

    public final operator fun plusAssign(v: Vertex): Unit {
        add(v)
    }

    public final operator fun minusAssign(v: Vertex): Unit {
        sub(v)
    }

    public final fun add(v: Vertex): Vertex {
        x += v.x
        y += v.y
        z += v.z
        return this
    }

    public final fun sub(v: Vertex): Vertex {
        x -= v.x
        y -= v.y
        z -= v.z
        return this
    }
}