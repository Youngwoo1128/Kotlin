package chap03.section1

fun main(){

    noParam { "Hello kotlin " }
    noParam ({"안녕 코틀린"})
}

fun noParam(out: () -> String) = println(out())
