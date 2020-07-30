package com.mezonworks.javaEssential.LSN4_Abstraction.abstraction.ex002_abstraction;

// Concrete Class A
class ConcreteClassA {
    public void operation() {
        System.out.println("ConcreteClassA.operation");
    }
}

// Abstract Class
abstract class AbstractClass extends ConcreteClassA {
    public abstract void method();
}

// Concrete Class B
class ConcreteClassB extends AbstractClass {

    @Override
    public void method() {
        System.out.println("ConcreteClassB.method");
    }
}

public class Main {
    public static void main(String[] args) {
        AbstractClass instance = new ConcreteClassB();
        instance.method();
        instance.operation();
    }
}
