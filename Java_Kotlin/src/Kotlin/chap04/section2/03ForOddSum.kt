package chap04.section2

fun main(){

    var zzaksu = 0

    for (zzak in 1..100 step 2){
        zzaksu += zzak
    }

    println("짝수의 합 : $zzaksu")

    var horsu = 0

    for (hol in 2..99 step 2){
        horsu += hol
    }

    println("홀수의 합 : $horsu")

    var sum = zzaksu + horsu

    println("1 부터 100 까지 짝수의 합과 홀수의 합을 합치면 $sum")
}