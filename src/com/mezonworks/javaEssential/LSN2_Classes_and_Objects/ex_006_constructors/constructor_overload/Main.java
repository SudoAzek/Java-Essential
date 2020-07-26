package com.mezonworks.javaEssential.LSN2_Classes_and_Objects.ex_006_constructors.constructor_overload;

public class Main {
    public static void main(String[] args) {
        Animal animalDefault = new Animal();
        Animal animalWithOneParameter = new Animal(12);
        Animal animalWithTwoParameters = new Animal(13, 55);

        System.out.println("Age: " + animalDefault.getAge() +"; Height: " + animalDefault.getHeight());
        System.out.println("Age: " + animalWithOneParameter.getAge() +"; Height: " + animalWithOneParameter.getHeight());
        System.out.println("Age: " + animalWithTwoParameters.getAge() +"; Height: " + animalWithTwoParameters.getHeight());
    }
}
