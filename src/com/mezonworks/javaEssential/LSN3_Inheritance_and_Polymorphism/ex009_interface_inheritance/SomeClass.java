package com.mezonworks.javaEssential.LSN3_Inheritance_and_Polymorphism.ex009_interface_inheritance;

public class SomeClass implements SomeInterface1, SomeInterface2, SomeInterface3 {
    @Override
    public void method1() {
        System.out.println("Method1");
    }

    @Override
    public void method2() {
        System.out.println("Method2");
    }

    @Override
    public void method3() {
        System.out.println("Method3");
    }
}
