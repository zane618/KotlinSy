package com.example.kotlinsy.classs.constructor

/**
 * create by zhangshi on 2020/4/23.
 * 内联函数
 */

interface MyListener{
    fun onEat(what: String)
}

fun main() {
    val man = Man("zhangsan")

    //普通模式
    man?.hello()
    man?.hi()

    //let模式, value = let体最后一行 / return的表达式
    val value = man?.let {
        it.hello()
        it.hi()
    }
    println(value)

    //also模式, result = man, 返回传入的man本身
    var result = man.also {
        it.hi()
        it.hello()
    }
    print(result.name)

    /**
     * with调用同一个对象的多个方法 / 属性时，可以省去对象名重复，直接调用方法名 / 属性即可
     * 返回值 = 函数块的最后一行 / return表达式
     */
    val withValue = with(man) {
        println()
        println("" + name + "," + hello() + "," + hi())
    }

    /**
     * run函数
     * 调用同一个对象的多个方法 / 属性时，可以省去对象名重复，直接调用方法名 / 属性即可
     * 定义一个变量在特定作用域内
    统一做判空处理
     */
    val runValue = man?.run {
        name
        hello()
        hi()
    }

    /**
     * apply
     * 与run函数类似，但区别在于返回值：
     *  run函数返回最后一行的值 / 表达式
     *  apply函数返回传入的对象的本身
     */
    val applyValue = man.apply {
        name
    }


}

class Man(var name: String){
    fun hello() {

    }
    fun hi() = 3
}
