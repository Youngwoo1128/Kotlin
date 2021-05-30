package chap03.section3

fun main(){
    shortFunc4(3){
        println("First call: $it")
    }

}
inline fun shortFunc4(a: Int, crossinline out: (Int) -> Unit){
    println("Before calling out()")
    nestedFunc {out(a)}
    println("After calling out()")
}

fun nestedFunc(body: () -> Unit){
    body()
}