package com.example.fastcampus.fastCampus01

import kotlin.random.Random

fun main() {
//    코틀린은 Null Safe
//    Integer a = 100;

//    자바는 null safe 한 코드를 구성해야 함
//    코틀린은 애초에 null safe 한 언어이다.

//    Scope Function(apply, with, let, also, run)
//    5가지의 다른 기능을 가진 함수
//    각각은 비슷하지만 조금씩 다른 특징을 가지고 있고 사용에 따라 다르게 쓴다.
//    코드를 좀 더 읽기 쉽게 만들어 준다.

    Random.nextInt(100).also { value ->
        println("랜덤값으로 받은 것은 : $value")
    }
    Random.nextInt(100).also {
        println("it으로 받아 버리기 $it")
    }

    val number: Int?
    var sInstanceString = sInstance.s
    println(sInstanceString)
//    val sumNumberStr = number?.let {
    }

// Data Class 기능 <- 데이터를 저장하는 목적으로 만든 클래스
data class JavaObject (val s: String)

var sInstance = JavaObject("히히")

fun practice() {
    var nullableNumber: Int? = null
//    lateinit var lateinitNumber: Int
//    lateinitNumber = 10

//    lazy init -> 미리 선언 해놓고 사용 할 때 할당이 됨, 즉 사용하기 전까지는 값이 들어가지 않는다.
    val lazyNumber: Int by lazy {
        100
    }
    var lazyNumberTest = 100 + lazyNumber
}

