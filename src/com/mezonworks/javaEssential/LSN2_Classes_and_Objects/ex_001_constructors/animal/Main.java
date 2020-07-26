package com.mezonworks.javaEssential.LSN2_Classes_and_Objects.ex_001_constructors.animal;

public class Main {
    public static void main(String[] args) {
//        Cat c = new Cat();
        Cat cat = new Cat("Pussy", 7);
        cat.setName("Shiny");
        cat.setAge(4);

        System.out.println(cat.getName() + " " + cat.getAge());
    }
}
