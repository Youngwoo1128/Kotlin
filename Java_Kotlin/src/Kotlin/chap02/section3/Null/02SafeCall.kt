package Kotlin.chap02.section3.Null

fun main(){
    var str1 : String? = "Hello Kotlin"
    str1 = null
    println("str1: $str1 length: ${str1?.length}")

    //위의 코드는 변수 str1을 검사한 다음 null이 아니면 str1의 멤버변수인 length에 접근해 값을 읽도록 만든거
    // str1을 검사해보니 아무것도 들어 있지 않으므로 length에 접근하지 않고 그대로 null을 출력

}

// 실행결과
// str1: null length: null
//=================================
// 이러면 실행됨
// 왜?
// ${str1?.length} 여기서 잘보면 str1 변수바로뒤에 ?를 사용했음
// 그러니까 이게 뭐냐면
// 코틀린에서는 ?. 이거를 세이프 콜이라고 부르는데
// 세이프 콜의 역할이 뭐냐하면 null이 할당되어 있을 가능성이 있는 변수를 검사하여 안전하게 호출하도록
// 도와주는 기법임
// 좀더 쉽게말하면 컴파일러가 "그래 그렇게 null을 쓰고 싶다는데 일단 함수 실행시켜서 null 나오게는 해줄께"
// 라고 말해주는거임
// 그래서 실행하면
// str1: null length: null 이렇게 나옴
// 다시한번 강조
// 세이프 콜 기법 - 변수 + ?.