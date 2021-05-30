package chap03.section1

fun main(){
    val result: Int
    val multi = {x: Int, y: Int -> x * y} //변수에 람다식 함수를 대입
    result = multi(10, 20)
    println(result)

    val aa: (Int, Int) -> Int = {x: Int, y: Int -> x * y}

    val intAndString: (Int, String) -> Any = {x: Int, y: String ->
        println("$y 의 나이는 $x 살 입니다.")
    }

    val zzangu = intAndString(5, "짱구")
}