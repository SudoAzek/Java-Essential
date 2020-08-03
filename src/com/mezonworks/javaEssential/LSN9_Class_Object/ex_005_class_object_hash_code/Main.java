package com.mezonworks.javaEssential.LSN9_Class_Object.ex_005_class_object_hash_code;


public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(12);
        Car car2 = new Car(12);
        Car car3 = new Car(13);

        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car3.hashCode());
    }
}
