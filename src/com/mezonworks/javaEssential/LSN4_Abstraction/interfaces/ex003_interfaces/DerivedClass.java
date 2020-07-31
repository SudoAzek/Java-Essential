package com.mezonworks.javaEssential.LSN4_Abstraction.interfaces.ex003_interfaces;

public class DerivedClass extends BaseClass implements Interface1, Interface2 {

    @Override
    public void method1() {
        System.out.println("Realization of method1 from the Interface1.");
    }

    @Override
    public void method2() {
        System.out.println("Realization of method2 from the Interface2.");
    }
}
