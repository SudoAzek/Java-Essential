package com.mezonworks.javaEssential.LSN4_Abstraction.interfaces.ex008_interfaces;

interface Interface {
    void method();
}

class BaseClass {
    public void method() {
        System.out.println("BaseClass.method()");
    }
}

class DerivedClass extends BaseClass implements Interface {
}

public class Main {
    public static void main(String[] args) {
        DerivedClass instance = new DerivedClass();
        instance.method();

        Interface instance1 = (Interface) instance;
        instance.method();
    }
}
