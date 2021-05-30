package chap03.section3

fun main(){
    shortfunc2(3) { println("First call: $it")}
}

inline fun shortfunc2(a: Int, noinline out: (Int)-> Unit){
    println("Before calling out()")
    out(a)
    println("After calling out()")
}