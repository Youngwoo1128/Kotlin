package chap03.section3

fun main(){

    val number = 4
    val result: Long

    result = factorial(number)
    println("Factorial: $number -> $result")
}

fun factorial(n: Int): Long{
    return if (n == 1) n.toLong() else n * factorial(n-1)
}
// 실행 결과 Factorial: 4 -> 24
// 재귀 함수는 자기 자신을 계속 호출함
// 그래서 조건이 필요한데
// 1. 무한 호출에 빠지지 않도록 탈출 조건을 만들어 둠
// 2. 스택 영역을 이용하므로 호출 횟수를 무리하게 많이 지정해 연산하지 않아야 함
// 3. 코드를 복잡하게 하지 않아야함
// 코틀린에서는 꼬리 재귀 함수(Tail Recursive Function)을 통해 스택 오버 플로 현상을 해결 할 수 있음.
// 이게 무슨 말이냐하면 스택에 계속 쌓이는게 아니라 꼬리를 무는 형태로 반복함
// 이떄 코틀린 고유의 tailrec 키워드를 사용해야 함

