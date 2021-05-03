package com.example.fastcampus.fastCampus01

//Function expression
fun sum01(a: Int, b: Int): Int {
    return a + b
}
//  코틀린에서는 sum02 함수의 문장을 더 많이 쓴다.
fun sum02(a: Int, b: Int) = a + b
fun max(a: Int, b: Int) = if(a > b) a else b

//Value, Variable <-- 변수의 선언

val a: Int = 1
val b = 2
val c = 3.14
//  val d: String 만 하면 null safety 때문에 오류가 날 수 있다.
//  d는 초기값이 없으면 null이 될 수 있는데, d는 null 이 될 수 없기 때문에
val d: String = "필수로 있어야 하는 구문"
//  항상 초기화를 하자!

fun main() {
    val e: String?
    e = "초기화를 하자"
    val k: String
    k = "필수로 있어야 하는 구문"

//    for(i in 1..5) {
//        print("$i ㅋㅋ")
//    }
//    for(i in 6 downTo 0 step 2) {
//        println(i)
//    }
//    for(i in 7 downTo 2) {
//        println(i)
//    }
////    내려갈 때는 무조건 downTo
//    for(i in 1..5 step 3) {
//        println(i)
//    }
    for(i in 1 until 5) {
        print("$i 임!")
    }

    val numberList = listOf(100, 200, 300)
    for(number in numberList) {
        println(number)
    }
//    100, 200, 300

//    when문
    var x = 10
    when(x) {
        1 -> println("ㅄ")
        2 -> println("x == 2")
        else -> {
            print("x는 무엇일 까요??!")
        }
    }
    when(x) {
        1,2 -> println("x는 1 아니면 2")
        else -> print("x는 뭘 까ㅣ요??")
    }
    when(x) {
        in 1..10 -> print("x는 1부터 10까지 중에 있다")
        !in 10..20 -> print("x는 10부터 20범위 안에 없음")
        else -> print("otherwise")
    }
//    타입을 비교 해서 추론 when 문
    when(x) {
        is Int -> print("x는 인트형")
        else -> print("x의 자료형은 무엇일까요?!")
   }

//    https://kotlinlang.org/ <- document 페이지에서 코틀린의 전반적인 내용 알아보기!
}


