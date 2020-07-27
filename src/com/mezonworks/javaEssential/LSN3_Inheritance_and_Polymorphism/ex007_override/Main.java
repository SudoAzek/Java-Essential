package com.mezonworks.javaEssential.LSN3_Inheritance_and_Polymorphism.ex007_override;

public class Main {
    public static void main(String[] args) {
        DerivedClass instance = new DerivedClass();
        instance.method();

        // Upcast
        BaseClass instanceUp = (BaseClass) instance;
        instance.method();

        // Downcast
        DerivedClass instanceDown = (DerivedClass) instanceUp;
        instanceDown.method();
    }
}
