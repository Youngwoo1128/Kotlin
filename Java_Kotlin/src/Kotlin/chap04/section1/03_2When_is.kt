package chap04.section1

fun main(){
    val str = "안녕하세염"
    val result = when(str){
        is String -> "문자열입니다"
        else -> false
    }
    print(result)
}