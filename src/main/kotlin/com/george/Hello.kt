package com.george

fun main() {
//    println("Hello Kotlin")
//    Human().hello()
//    val h = Human(66.5f, 1.7f)
    val h = Human(weight = 66.5f, height = .7f)
    h.hello()
    println(h.bmi())
    val score = 88;
    println(score > 60)
    var c: Char = 'A'
    println(c.toInt() > 60)
//    val age = 19; //可不指定資料型態，由Kotlin自動給定，稱作變數型態的自動推斷
//    val age2 : Int = 19; //可指定資料型態，在Kotlin只有參照資料型態，因此首字母皆大寫
//    var weight = 66.5; //預設以Double存有小數之數字
    /*var weight = 66.5f; //加上
    var name: String //只定義不給值時要加上資料型態，否則Kotlin無法推斷
    name = "Hank"*/
}

//class Human(var weight: Float, var height: Float, var name: String = "" ) {
class Human(var name: String = "", var weight: Float, var height: Float) {
    init {
        println("test $weight")
//        println("test" + weight)
    }

//    constructor(name: String, weight: Float, height: Float) : this(weight, height)

    fun bmi(): Float {
        var bmi = weight / (height * height)
        return bmi
    }

    fun hello() {
        println("Hello Kotlin")
    }
}