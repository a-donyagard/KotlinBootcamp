package com.example.android.kotlinbootcamp.example

data class Fish (var name: String)

fun fishExamples() {
    val fish = Fish("splashy")  // all lowercase
    with(fish.name) {
        println(this.capitalize())
    }
}

fun main () {
    fishExamples()
}