package com.george;

public class Person {
    String name;
    float weight; //field (property of a class)
    float height; //field (property of a class)

    public Person(float weight, float height) {
        /*weight and height in this method are local variables.
        They are different from the fields of the "Person" class*/
        this.weight = weight;
        this.height = height;
    }

    public Person(String name, float weight, float height) {
        this(weight, height); //use this() to reuse the Person constructor defined above
        this.name = name;
        /*this.weight = weight;
        this.height = height;*/
    }

    //if there is no custom constructor in the class, super() is added in the background.
    /*public Person() {
        super();
    }*/

    public float bmi() {
        float bmi = weight / (height * height);
        return bmi;
    }

    public void hello() {
        System.out.println("Hello World");
    }
}
