package com.mezonworks.javaEssential.LSN10_Generics.ex007_generics_bounded_type;

class Base {
}

class Derived extends Base {
}

class MyClass<T extends Base> {
}

public class Main {
    public static void main(String[] args) {
        MyClass<Base> mc1 = new MyClass<>();

        MyClass<Derived> mc2 = new MyClass<>();

//        MyClass<String> mc3 = new MyClass<>(); // Error;
    }
}
