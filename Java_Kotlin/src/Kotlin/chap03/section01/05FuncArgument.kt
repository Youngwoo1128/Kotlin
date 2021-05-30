package chap03.section1

fun main(){

    val res1 = sum1(3,2) // 일반인자
    val res2 = mul(sum(10, 10), 3) // 인자에 함수를 사용

    println("res1 = $res1, res2 = $res2");

}

fun sum1(a: Int, b: Int) = a + b

fun mul(a: Int, b: Int) = a * b