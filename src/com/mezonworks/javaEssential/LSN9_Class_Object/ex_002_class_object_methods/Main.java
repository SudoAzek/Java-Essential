package com.mezonworks.javaEssential.LSN9_Class_Object.ex_002_class_object_methods;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(160, "Blue");

        System.out.println(car.getClass());
        System.out.println(car.toString());
        System.out.println(car.hashCode());
    }
}
