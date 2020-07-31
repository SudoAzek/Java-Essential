package com.mezonworks.javaEssential.LSN4_Abstraction.interfaces.ex006_interfaces;

interface Interface {
    void method();
}

abstract class AbstractClass implements Interface {
    @Override
    public void method() {
        System.out.println("method - realization of interface in the abstract class.");
    }
}

class ConcreteClass extends AbstractClass {
}

public class Main {
    public static void main(String[] args) {
        ConcreteClass instance = new ConcreteClass();
        instance.method();
    }
}
