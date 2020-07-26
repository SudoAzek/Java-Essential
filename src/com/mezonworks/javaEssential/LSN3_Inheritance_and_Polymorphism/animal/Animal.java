package com.mezonworks.javaEssential.LSN3_Inheritance_and_Polymorphism.animal;

public class Animal {
    private int weight;
    private String breed;

    // Default Constructor
    Animal() {
    }

    // Custom Constructor
    Animal(int weight, String breed) {
        this.weight = weight;
        this.breed = breed;
    }

    public int getWeight() {
        return weight;
    }

    public String getBreed() {
        return breed;
    }
}
