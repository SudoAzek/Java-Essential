package com.mezonworks.javaEssential.LSN4_Abstraction.interfaces.ex001_interfaces;

interface Interface {
    void method();
}

class MyClass implements Interface {
    @Override
    public void method() {
        System.out.println("Method - Realization of Interface.");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass instance = new MyClass();

        instance.method();
    }
}
