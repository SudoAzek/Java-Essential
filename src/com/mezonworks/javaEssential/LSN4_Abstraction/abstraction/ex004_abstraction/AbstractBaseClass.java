package com.mezonworks.javaEssential.LSN4_Abstraction.abstraction.ex004_abstraction;

public abstract class AbstractBaseClass {
    public void simpleMethod() {
        System.out.println("AbstractBaseClass.simpleMethod");
    }

    public void overriddenMethod() {
        System.out.println("AbstractBaseClass.overriddenMethod");
    }

//    Two similar declarations of abstract method.
//    abstract public void abstractMethod();
    public abstract void abstractMethod();
}
