package Kotlin.chap02.section3.Cast

fun main(){
    val num = 256

    if (num is Int){
        println("Int의 $num")
    }else if (num !is Int){
        println("Int가 아닌 $num")
    }

    val x: Any
    x = "Hello"
    if(x is String){
        println(x.length)
    }

//    val p: String? = y as? String


}