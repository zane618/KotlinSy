package com.example.kotlinsy.hightorder.`interface`

import java.util.*

/**
 * create by zhangshi on 2020/5/28.
 */

fun main() {

    download{
        object : ITest{
            override fun onTest(i: Int) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        }
    }

}

fun download(listener:()-> Unit) {

}

interface ITest {
    fun onTest(i: Int)
}

