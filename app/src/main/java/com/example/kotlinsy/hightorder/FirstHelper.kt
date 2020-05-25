package com.example.kotlinsy.hightorder

/**
 * create by zhangshi on 2020/5/12.
 */

class Helper {
    fun getResultLength(s1: String, s2: String) =
        if(s1.length > s2.length) s1.length.toString() else s2.length.toString()
}