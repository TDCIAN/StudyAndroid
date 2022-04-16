package com.example.myapplication.Kotlin

// 04. Functgion
// - 함수
// - 어떤 input을 넣어주면 어떤 output이 나오는 것
fun plus(first: Int, second: Int): Int {
    val result: Int = first + second
    return result
}

fun plusFive(first: Int, second: Int = 5): Int {
    val result: Int = first + second
    return result
}

// 반환값이 없는 함수 만들기
fun printPlus(first: Int, second: Int): Unit {
    val result: Int = first + second
    println(result)
}

fun printUnit(first: Int, second: Int = 3) {
    val result: Int = first + second
    print(result)
}

// 간단하게 함수를 선언하는 방법
fun plusShort(first: Int, second: Int) = first + second

// 가변인자를 갖는 함수 선언하는 방법
fun plusMany(vararg numbers: Int) {
    for (number in numbers) {
        println(number)
    }
}

fun main(array: Array<String>) {
    val result = plus(5, 10)
    println(result)
    val another = plus(first = 6, second = 14)
    println(another)
    val plusFive = plusFive(7)
    println(plusFive)

    val printPlust = printPlus(10, 10)
    println(printPlust)

    val printUnit = printUnit(3)
    println(printUnit)

    val plusShortResult = plusShort(first = 3, second = 9)
    println(plusShortResult)

    println()
    plusMany(100)
}