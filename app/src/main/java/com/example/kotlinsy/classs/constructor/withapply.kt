package com.example.kotlinsy.classs.constructor

import kotlin.text.StringBuilder

/**
 * create by zhangshi on 2020/4/23.
 * with函数
 */

fun main() {
    println(alphabet())
    println(alphabetWith())

    print(alphabetApply())

}

fun alphabetApply(): String = StringBuilder().apply {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\n Now I know the alphabet!")
}.toString()

fun alphabet(): String {
    var stringBuilder = StringBuilder()

    for (letter in 'A'..'Z') {
        stringBuilder.append(letter)
    }
    stringBuilder.append("\n Now I know the alphabet!")
    return stringBuilder.toString()
}

fun alphabetWith(): String {
    val stringBuilder = StringBuilder()
    return with(stringBuilder) {
        for (letter in 'A'..'Z') {
            this.append(letter) //this代表stringBuilder
        }
        this.append("\n Now I know the alphabet!")
        this.toString()
    }
}

