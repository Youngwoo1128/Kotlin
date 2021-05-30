package Kotlin.chap02.section3.Null

fun main(){
    var str1 : String? = "짱구"
    str1 = null

    println("str1: $str1 length: ${str1?.length ?: "null 이라 몇글자인지 모르겠음"}")
}