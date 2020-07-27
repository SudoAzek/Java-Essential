package com.mezonworks.javaEssential.LSN3_Inheritance_and_Polymorphism.ex006_inheritance;

public class Main {
    public static void main(String[] args) {
        DerivedClass instance = new DerivedClass();
        instance.method();

        // Upcast
        BaseClass instanceUp = (BaseClass) instance;
        instanceUp.method();

        // Downcast
        DerivedClass instanceDown = (DerivedClass) instanceUp;
        instanceDown.method();

    }
}
