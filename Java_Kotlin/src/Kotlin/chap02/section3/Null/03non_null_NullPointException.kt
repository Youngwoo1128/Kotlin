package Kotlin.chap02.section3.Null

fun main() {
    var str1: String? = "Hello Kotlin"
    str1 = null
//    println("str1: $str1 length: ${str1!!.length}")
// 역시 변수 str1 뒤를 잘보면 !!. 이라는게 있음
// 이건 뭐냐면 강제로 NPE를 나오게 하는거임
// 이 기법이 non_null 기법이라고 부르고 표기법은 !!. 이렇게 쓰면 됨
// non_null 기법은 변수에 할당된 값이 null 이 아님을 단정하므로 컴파일러가 null 검사 없이 무시함.
// 따라서 변수에 null이 할당되어 있어도 컴파일은 잘 진행됨.
// 근데 위 코드는 NPE를 발생시킴
}