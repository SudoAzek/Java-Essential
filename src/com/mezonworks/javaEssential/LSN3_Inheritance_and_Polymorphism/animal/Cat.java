package com.mezonworks.javaEssential.LSN3_Inheritance_and_Polymorphism.animal;

public class Cat extends Animal {
    int age;
    String name;

    // Default Constructor
    Cat() {
    }

    // Custom Constructor
    Cat(int age, String name, int weight, String breed) {
        super(weight, breed);
        this.age = age;
        this.name = name;
    }
}
