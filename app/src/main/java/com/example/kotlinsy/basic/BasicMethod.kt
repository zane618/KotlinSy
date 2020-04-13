package com.example.kotlinsy.basic

/**
 * create by zhangshi on 2020/4/13.
 * 建单的方法创建，很易懂
 */

fun main() {
    println(sum(1,2))
    println(sum2(2, 3))
    println(sum3(0, 0))
    println(sum4(0, 0))

    var str : String = "abc"
    val x = parseInt(str)
    val y = parseInt("2")
//    if(x !=null)
    println(x)
    println(getStringLength("234243"))

    //for循环
    println("for循环")
    val items = listOf<String>("apple", "banana", "kiwifruit")
    for (item in items) {
        print(item + ",")
    }
    //~~
    println()
    for (index in items.indices) {
        print(items[index] + ",")
        if (index == items.size - 1) {
            println()
        }
    }
    //~~
    println("while循环")
    //while 循环
    var index = 0
    while (index < items.size) {
        print(items[index] + ",")
        index ++
        if (index == items.size) {
            println()
        }
    }

    println("when 表达式")
    println(describe("H"))

    //使用区间（range)
    println("使用区间（range)")
    println(rangeTest())
    rangeTest2()

    lambdaTest()

}

fun lambdaTest() {
    println("lambda表达式")
    val fruits = listOf("bananan", "apple", "orange")
    val listFilter = fruits.filter { it.startsWith("a") }

            println("size:" + fruits.size)
            println("listFilter:size:" + listFilter.size)
//        .sortedBy { it }
//        .map { it.toUpperCase() }
//        .forEach { println(it) }
}

fun rangeTest2() {
    val list = listOf<Int>(1, 2, 3)
    println(list.indices) //打印出0..2
    if (list.contains(2)) {
        println("contains:2")
    }
}

fun rangeTest(): Boolean {
    val x = 10
    val y = 9
    if (x in 1..y + 1) {
        return true
    }
    return  false
}

fun describe(obj: Any): String =
    when (obj) {
        1 -> "one"
        "H" -> "Hello"
        is Long -> "Long"
        !is String -> "not a string"
        else -> "Unknown"
    }

fun sum(a: Int, b: Int) : Int {
    return  a + b
}

// 讲表达式作为函数体，返回值类型自动推断的方法
fun sum2(a: Int, b: Int) = a + b

fun sum3(a: Int, b: Int): Unit {
    println("返回无意义的值")
    return
}
fun sum4(a: Int, b: Int) {
    println("返回无意义的值, Unit可以省略")
    return
}

/**
 * 来个 条件表达式
 */
fun  maxOf(a: Int , b: Int) = if(a >b) a else b

fun maxOf2(a: Int, b: Int): Int {
    if(a > b)
        return a
    else
        return b
}

//当变量的值可以为null的时候，必须在声明处的类型后添加？来标识该应用可为空
fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

/*
* is 运算符检测一个表达式是否某类型的一个实例。 如果一个不可变的局部变量或属性已经
  判断出为某类型， 那么检测后的分支中可以直接当作该类型使用， 无需显式转换：
*/
fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }
    return null
}


