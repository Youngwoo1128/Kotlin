package chap04.section1

fun main(){
    print("Enter the score: ")
    val score = readLine()!!.toDouble()
    // readLine()은 사용자의 입력값을 받는 함수
    // 받을때는 String으로 받지만 뒤에 .toDouble()이 있어서 소수로 리턴됨
    var grade: Char = 'F'

    if (score >= 90.0){
        grade = 'A'
    }else if (score in 80.0..89.9){
        grade = 'B'
    }else if (score in 70.0..79.9){
        grade = 'C'
    }
    println("Score: $score , grade: $grade")
}