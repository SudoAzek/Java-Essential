package com.mezonworks.javaEssential.LSN9_Class_Object.ex_004_class_object_equals_overridden;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(2);
        Car car2 = new Car(2);

        Car car3 = car1;

        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car3.hashCode());

        System.out.println(car1.equals(car2));
        System.out.println(car1.equals(car3));
    }
}
