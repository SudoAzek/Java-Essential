package com.mezonworks.javaEssential.LSN2_Classes_and_Objects.ex_008_static.stat;

public class Car {
    String model;
    String color;

    static double count;

    public static void main(String[] args) {
        Car c1 = new Car();
        Car.count = 1;

        Car c2 = new Car();
        Car.count = 2;

        Car c100 = new Car();
        Car.count = 100;

        System.out.println(Car.count);
    }
}
