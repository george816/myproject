package com.george;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//        new Person().hello();
        Person p = new Person("George", 66.6f, 1.7f);
        p.hello();
        p.weight = 66.5f;
        p.height = 1.7f;
        System.out.println(p.bmi());
        /*int age = 19; //Primitive data types (short, int, long, float, double, char, string, boolean)
        Integer age2 = 19;; //Reference data types, or named "Wrapper Class"
        char c = 'A';
        Character c2 = c;*/
    }
}
