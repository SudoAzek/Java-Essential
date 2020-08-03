package com.mezonworks.javaEssential.LSN9_Class_Object.ex_001_class_object.declaration;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.toString();

        Car car = new Car();
        car.toString();

        A a = new A();
        a.toString();
    }
}

class Car extends Object {
}

class A {
}
