package Kotlin.chap02.section3.Null

fun main(){
    var str1 : String? = "Hello Kotlin"
    str1 = null //오류 null을 허용하지 않음
//    println("str1: $str1 length: ${str1.length}") //null을 허용하면 length가 실행될수 없음.
}