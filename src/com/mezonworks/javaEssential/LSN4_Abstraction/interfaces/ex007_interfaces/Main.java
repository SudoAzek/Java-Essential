package com.mezonworks.javaEssential.LSN4_Abstraction.interfaces.ex007_interfaces;

interface Interface {
    void method();
}

abstract class AbstractClass implements Interface {
    @Override
    public abstract void method();
}

class ConcreteClass extends AbstractClass {
    public void method() {
        System.out.println("method - realization of interface  in the concrete class.");
    }
}

public class Main {
    public static void main(String[] args) {
        ConcreteClass instance = new ConcreteClass();
        instance.method();
    }
}
