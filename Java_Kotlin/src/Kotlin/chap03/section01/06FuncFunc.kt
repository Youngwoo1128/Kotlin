package Kotlin.chap03.section01

fun main(){

    println("funFunc: ${funcFunc( )}")
}

fun sum2(a: Int, b: Int) = a + b

fun funcFunc( ): Int = sum2(2, 2)


