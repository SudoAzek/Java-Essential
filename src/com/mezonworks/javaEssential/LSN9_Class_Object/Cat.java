package com.mezonworks.javaEssential.LSN9_Class_Object;

public class Cat {
    String name;

    Cat(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Cat c1 = new Cat("Pussy");
//        Cat c2 = new Cat("Barsik");
        Cat c2 = c1;

        if(c1 == c2) {
            System.out.println("Cats are equal");
        } else {
            System.out.println("Cats aren't equal");
        }
    }
}
