package chap03.section1

import kotlin.math.max

fun main(){
    val num1 = 10
    val num2 = 3
    val result: Int?

    result = max(num1, num2)

    println(result)
}

fun max(a: Int, b: Int): Int {

    val aa = if (a>b){
        return a
    } else {
        return b
    }

    return aa
}