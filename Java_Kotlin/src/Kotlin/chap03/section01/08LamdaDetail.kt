package chap03.section1

fun main(){
//    람다식 기본형
    // 1.
    val lamdaBasic1: (Int, Int) -> Int = {x: Int, y: Int -> x * y}
    println(lamdaBasic1(10, 1))

    //2.
    val lamdaBasic2: (Int, Int) -> Int = { x: Int, y: Int ->
        x * y
    }

    println(lamdaBasic2(10, 1))

    //3.
    val lamdaApplication1 = {x: Int, y: Int -> x * y}
    println(lamdaApplication1(10, 10))

    //4.
    val lamdaApplication2: (Int, Int) -> Int = {x, y -> x * y}
    println(lamdaApplication2(50, 50))

    //5. error case
//    val errorCase = {x, y -> x * y}
//    println(errorCase(100, 100))
    // 추론 불가

    //6.
    val greet: () -> Unit = {println("Hello World")}
    val square: (Int) -> Int = {x -> x * x}
    println(greet())
    println(square(10))

    val nestedLamda: () -> () -> Unit = {{ println("nested")}}
    println(nestedLamda())

}