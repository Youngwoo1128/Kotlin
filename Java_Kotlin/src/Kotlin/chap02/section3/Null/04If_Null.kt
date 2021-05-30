package Kotlin.chap02.section3.Null

fun main(){
    var str1 : String? = "짱구"
    str1 = null
    //조건문을 통한 null 상태 검사
    val len = if (str1 != null) {
        str1.length
    }else {
        "이거 null 이라 몇글자인지 모르겠음"
    }

    println("str1: $str1 length: ${len}")
}
// 실행결과
// str1: null length: 이거 null 이라 몇글자인지 모르겠음
// ===============================================
// 세이프 콜이나 non-null 기법 말고 조건문으로도 null을 허용한 변수를 검사해도됨.
// 그러니까 null을 허용한 변수의 null 상태 가능성을 검사하기만 하면 코틀린 컴파일러는 오류를 발생시키지 않음.
// 조건문은 나중에 더 자세히 공부해보도록 해보자