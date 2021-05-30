package chap03.section1

fun main(){
    normalVarargs(1,7,3,4)

    normalVarargs(4,5,6)
}

fun normalVarargs(vararg count: Int){

    for (num in count){
        println(num)
    }
    println()
}