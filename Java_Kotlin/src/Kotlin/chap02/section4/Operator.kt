package Kotlin.chap02.section4

fun main(){
    // 산술 연산자
//    + 덧셈
//    - 뺄셈
//    * 곱셈
//    ? 나눗셈
//    % 나눈 몫
    var n: Int = 3
    if ((n % 2) == 1) println("$n 은 홀수") else println("$n 은 짝수")

    // 대입 연산자
//    = 오른쪽 값을 왼쪽에 대입
//    += 두항을 더한뒤 왼쪽 항에 대입
//    나머지도 동일

    // 증가 연산자와 감소 연산자
//    ++ 항의 값에 1 증가 ++num, num++
//    -- 항의 값에 1 감소 --num, num--

    // 증가 연산자 확실히 짚고 넘어가기
    var num1 = 10
    var num2 = 10
    var result1 = ++num1 //num 의 값이 증가 후 대입
    var result2 = num2++ // num 의 값을 대입 후 증가

    println("result1: $result1")
    println("result2: $result2")
    println("num1: $num1")
    println("num2: $num2")

//    비교연산자
//    == 값이 같은가
//    != 값이 다른가
//    === 참조주소가 같은가
//    !== 참조주소가 다른가
}