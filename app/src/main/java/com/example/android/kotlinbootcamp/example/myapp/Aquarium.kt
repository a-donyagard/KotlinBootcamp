package com.example.android.kotlinbootcamp.example.myapp

class Aquarium(var width: Int = 20, var height: Int = 40, var length: Int = 100) {
    var volume: Int
        get() = width * length * height / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }

    init {
        println("aquarium initializing")
    }

    constructor(numberOfFish: Int) : this() {
        // 2,000 cm^3 per fish + extra room so water doesn't spill
        val tank = numberOfFish * 2000 * 1.1
        // calculate the height needed
        height = (tank / (length * width)).toInt()
    }

    fun printSize() {
        println(
            "Width: $width cm\n" +
                    "Height: $height cm\n" +
                    "Length: $length cm"
        )
        // 1 liter = 1000 cm^3
        println("Volume: $volume l")
    }
}