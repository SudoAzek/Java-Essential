package com.mezonworks.javaEssential.LSN4_Abstraction.abstraction.ex004_abstraction;

public class ConcreteDerivedClass extends AbstractBaseClass {
    @Override
    public void overriddenMethod() {
        System.out.println("DerivedClass.overriddenMethod()");
    }

    @Override
    public void abstractMethod() {
        System.out.println("DerivedClass.abstractMethod()");
    }
}
