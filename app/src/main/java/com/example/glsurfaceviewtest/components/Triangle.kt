package com.example.glsurfaceviewtest.components

class Triangle(
    val p1: Vector3, val p2: Vector3, val p3: Vector3
) {
    val edges: Array<Vector3> = arrayOf(
        Vector3.makeWithVertex(p1.vertex, p2.vertex - p1.vertex),
        Vector3.makeWithVertex(p2.vertex, p3.vertex - p2.vertex),
        Vector3.makeWithVertex(p3.vertex, p1.vertex - p3.vertex)
    )

    public fun move(v: Vertex): Triangle {
        p1.vertex += v
        p2.vertex += v
        p3.vertex += v
        return this
    }

    override fun toString(): String {
        return edges.joinToString { vec -> vec.toString() }
    }
}