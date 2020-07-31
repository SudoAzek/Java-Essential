package com.mezonworks.javaEssential.LSN4_Abstraction.interfaces.ex002_interfaces;

public class DerivedClass implements Interface1, Interface2 {
    @Override
    public void method1() {
        System.out.println("Realization of a method method1 from Interface1");
    }

    @Override
    public void method2() {
        System.out.println("Realization of a method method2 from Interface2");
    }
}
