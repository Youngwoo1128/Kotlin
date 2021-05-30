package chap04.section1

fun main(){

    val a = 12
    val b = 7

    val max = if (a > b){
        println("a 선택")
        a
    }else {
        println("b 선택")
        b
    }

    println(max)

    val number = 0
    val result = if (number > 0){
        "양수값"
    } else if (number < 0){
        "음수값"
    } else
        0
    println(result)
}
