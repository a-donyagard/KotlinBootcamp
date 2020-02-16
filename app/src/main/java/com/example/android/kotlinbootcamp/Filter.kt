package com.example.android.kotlinbootcamp

val decorations = listOf ("rock", "pagoda", "plastic plant", "flowerpot", "perspolis")
val eager = decorations.filter { it[0] == 'p'}
fun main(){
    println("eager: "+ eager)

    // lazy, will wait until asked to evaluate
    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("filtered: " + filtered)

    // force evaluation of the lazy list
    val newList = filtered.toList()
    println("new list: " + newList)
}