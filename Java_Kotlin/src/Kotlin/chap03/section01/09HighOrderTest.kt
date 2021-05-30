package chap03.section1

fun main(){

    var result: Int
    result = highOrder({x, y -> x + y}, 10, 20)
    println(result)

    // 인자값과 리턴 값이 없는 람다식 함수
    val out: () -> Unit = { println("Hello world")}
    out()

    val new = out
    new()
}

fun highOrder(sum: (Int, Int) -> Int, a: Int, b: Int): Int{
    return sum(a, b)
}