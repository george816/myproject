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
        int score = 88;
        System.out.println(score < 80 || score <= 88);
        char c = 'A';
        System.out.println(c > 60);
        System.out.println(c > 'a');

        /*int age = 19; //Primitive data types (short, int, long, float, double, char, string, boolean)
        Integer age2 = 19;; //Reference data types, or named "Wrapper Class"
        char c = 'A';
        Character c2 = c;*/
    }
}
