package com.george

fun main() {
//    println("Hello Kotlin")
//    Human().hello()
    val h = Human()
    h.hello()
//    val age = 19; //可不指定資料型態，由Kotlin自動給定，稱作變數型態的自動推斷
//    val age2 : Int = 19; //可指定資料型態，在Kotlin只有參照資料型態，因此首字母皆大寫
//    var weight = 66.5; //預設以Double存有小數之數字
    var weight = 66.5f; //加上
    var name : String //只定義不給值時要加上資料型態，否則Kotlin無法推斷
    name = "Hank"
}

class Human {
    fun hello() {
        println("Hello Kotlin")
    }
}