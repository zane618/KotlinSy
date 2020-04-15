package com.example.kotlinsy.classs

/**
 * create by zhangshi on 2020/4/14.
 */
class UserFile {
    companion object User {
        var name: String = "sss"
        lateinit var age: String

        init {
            age = "19"
        }
    }
    object User2 {
        var grade: String
        get() {return "123"}
        set(value) {
            grade = "456"}
    }
    init {
        User2.grade = "999"
    }
}