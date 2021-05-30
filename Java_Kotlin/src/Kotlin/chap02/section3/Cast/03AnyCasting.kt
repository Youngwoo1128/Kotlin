package Kotlin.chap02.section3.Cast

fun main(){
    var a: Any = 1
    a = 20L
    println("a: $a type: ${a.javaClass}")
}