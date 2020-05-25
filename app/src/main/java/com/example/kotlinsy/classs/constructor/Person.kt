package com.example.kotlinsy.classs.constructor

/**
 * create by zhangshi on 2020/4/23.
 * 可继承的class
 */

fun main() {
    val person = Person("name", 18)

    println(person.toString())
    println(Person1("lisi", 11))
    println(Person2("wanger"))
//    println(Person3().name) //不是类的属性，报错
    println(Person4().name)
    println(Person4().age)
    println(Person4())
}


open class Person (name: String, age: Int){

}

open class Person1 (var name: String, var age: Int){

}

data class Person2(var name: String){
    override fun toString(): String {
        return super.toString()
    }

}

class Person3() : Person("jicheng", 10) {

}

class Person4() : Person1("shuxing", 1) {

}
