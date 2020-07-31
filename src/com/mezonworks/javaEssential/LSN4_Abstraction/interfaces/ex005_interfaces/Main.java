package com.mezonworks.javaEssential.LSN4_Abstraction.interfaces.ex005_interfaces;


interface Interface1 {
    void method();
}

interface Interface2 {
    void method();
}

class ConcreteClass implements Interface1, Interface2 {
    @Override
    public void method() {
        System.out.println("method1 - realization of interface Interface (1-2)");
    }
}

public class Main {
    public static void main(String[] args) {
        ConcreteClass instance = new ConcreteClass();
        instance.method();

        Interface1 instance1 = instance;
        instance1.method();

        Interface2 instance2 = instance;
        instance2.method();

    }
}
