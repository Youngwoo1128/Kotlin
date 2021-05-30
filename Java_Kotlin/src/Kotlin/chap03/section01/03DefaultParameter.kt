package chap03.section1

fun main(){

    val name = "짱구"
    val email = "zzangu@naver.com"

    add(name)
    add(name, email)
    add("맹구", "mangu@naver.com")

    defaultArgs()
    defaultArgs(200)
}

fun add(name: String, email: String = "default") {
    val output = "$name 님의 이메일은 $email 입니다."
    println(output)

}

fun defaultArgs(x: Int = 100, y: Int = 200){
    println(x + y)
}