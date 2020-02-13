package com.george;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//        new Person().hello();
        Person p = new Person();
        p.hello();
        int age = 19; //基本資料型態，為全小寫，共有8種(short, int, long, float, double, char, string, boolean)
        Integer age2 = 19;; //參照資料型態，為類別因此首字母大寫，每種基本資料型態都有對應的參照資料型態，又稱包裝類別(Wrapper Class)
        char c = '錢';
        Character c2 = c;
    }
}
