package chap04.section1

fun main(){

    val x: Int = 100

    when(x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        3, 4 -> println("x == 3 or x == 4")
        else -> {
            println("x는 1,2 가 아닙니다.")
        }
    }
    when (x) {
        in 1..10 -> print("x는 1 이상 10 이하입니다.")
        !in 10..20 -> print("x는 10 이상 20 이하의 범위에 포함되지 않습니다.")
        else -> print("x는 어떤 범위에도 없습니다.")
    }
}