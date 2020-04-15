package com.example.kotlinsy.classs.constructor

/**
 * create by zhangshi on 2020/4/14.
 */
class User {
    var name: String

    constructor(name: String){
        this.name = name
    }

}

class User2 constructor(name: String){
    var name : String = name
}
