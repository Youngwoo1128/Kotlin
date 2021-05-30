package Kotlin.chap02.section2

fun main(){
    var a = 1
    val str = "a = $a"
    println(str)

    val str2 = "a = ${a + 2}"
    println(str2)
}