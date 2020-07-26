package com.mezonworks.javaEssential.LSN3_Inheritance_and_Polymorphism.animal;

public class Main {
    public static void main(String[] args) {
        Cat c = new Cat(5, "Kotik", 2, "Persian");

        System.out.println("Cat's age: " + c.age);
        System.out.println("Cat's name: " + c.name);
        System.out.println("Cat's weight: " + c.getWeight() + "-kg(s)");
        System.out.println("Cat's breed: " + c.getBreed());
    }
}
