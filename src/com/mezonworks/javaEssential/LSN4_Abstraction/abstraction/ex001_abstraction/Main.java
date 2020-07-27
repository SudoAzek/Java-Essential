package com.mezonworks.javaEssential.LSN4_Abstraction.abstraction.ex001_abstraction;

// Abstract class
abstract class AbstractClass {
    public abstract void method();
}

// Concrete class
class ConcreteClass extends AbstractClass {
    @Override
    public void method() {
        System.out.println("Implementation");
    }
}

public class Main {
    public static void main(String[] args) {
        AbstractClass instance = new ConcreteClass();

        instance.method();
    }
}
