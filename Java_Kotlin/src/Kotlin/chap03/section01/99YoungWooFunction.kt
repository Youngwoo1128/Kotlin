package chap03.section1

fun main(){

    println( sum() )
    println( sum(a = 1) )
    println( sum(a = 1, c = 1, b = 1) )

}

fun sum(a: Int = 0, b: Int = 0 , c: Int = 0) = a + b + c