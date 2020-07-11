package com.example.android.kotlinbootcamp.example.myapp.decor

data class Decoration(val rocks: String, val wood: String, val diver: String) {
}

fun makeDecorations() {
    val decoration1 = Decoration("granite", "gerdu", "diver")
    println(decoration1)

    val decoration2 = Decoration("slate", "wood", "diver")
    println(decoration2)

    val decoration3 = Decoration("slate", "wood", "diver")
    println(decoration3)

    println(decoration1 == decoration2)
    println(decoration3 == decoration2)

    // Assign all properties to variables.
    val (rock, wood, diver) = decoration3
    println(rock)
    println(wood)
    println(diver)
}

enum class Direction(val degrees: Int) {
    NORTH(0), SOUTH(180), EAST(90), WEST(270)
}

fun main(){
    makeDecorations()

    println(Direction.EAST.name)
    println(Direction.EAST.ordinal)
    println(Direction.EAST.degrees)
}