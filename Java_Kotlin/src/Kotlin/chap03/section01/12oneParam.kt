package chap03.section1

fun main(){

    oneParam { a -> "Hello world!! $a"  }

    println(oneParam { a -> "안녕 코틀린 $a" })
}

fun oneParam(out: (String) -> String){
    println("One Param")
}