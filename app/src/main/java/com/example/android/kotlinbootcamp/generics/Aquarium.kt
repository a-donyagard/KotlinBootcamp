package com.example.android.kotlinbootcamp.generics

open class WaterSupply(var needsProcessing: Boolean)

class TapWater : WaterSupply(true) {
    fun addChemicalCleaners() {
        needsProcessing = false
    }
}

class FishStoreWater : WaterSupply(false)

class LakeWater : WaterSupply(true) {
    fun filter() {
        needsProcessing = false
    }
}

class Aquarium<T: WaterSupply>(val waterSupply: T) {
    fun addWater() {
        check(!waterSupply.needsProcessing) { "water supply needs processing first" }
        println("adding water from $waterSupply")

        /*if (waterSupply.needsProcessing) {
            cleaner.clean(waterSupply)
        }
        println("water added")*/
    }
}

fun <T: WaterSupply> addItemTo(aquarium: Aquarium<T>) = println("item added")

/*interface Cleaner<in T: WaterSupply> {
    fun clean(waterSupply: T)
}

class TapWaterCleaner : Cleaner<TapWater> {
    override fun clean(waterSupply: TapWater) = waterSupply.addChemicalCleaners()
}*/

fun <T: WaterSupply> isWaterClean(aquarium: Aquarium<T>) {
    println("aquarium water is clean: ${aquarium.waterSupply.needsProcessing}")
}

//fun <R: WaterSupply> hasWaterSupplyOfType() = waterSupply is R

fun genericsExample() {
    val aquarium = Aquarium(TapWater())
    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")
    aquarium.waterSupply.addChemicalCleaners()
    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")

    /*val aquarium2 = Aquarium("string")
    println(aquarium2.waterSupply)

    val aquarium3 = Aquarium(null)
    if (aquarium3.waterSupply == null) {
        println("waterSupply is null")
    }*/

    val aquarium4 = Aquarium(LakeWater())
    aquarium4.waterSupply.filter()
//    val cleaner = TapWaterCleaner()
    aquarium4.addWater()

    addItemTo(aquarium)

    isWaterClean(aquarium)
}

fun main() {
    genericsExample()
}