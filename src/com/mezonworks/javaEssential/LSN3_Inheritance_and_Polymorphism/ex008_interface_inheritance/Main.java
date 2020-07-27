package com.mezonworks.javaEssential.LSN3_Inheritance_and_Polymorphism.ex008_interface_inheritance;

public class Main {
    public static void main(String[] args) {
        SomeClass instance = new SomeClass();
        instance.method();
        System.out.println(instance.publicField);

        // Upcast
        SomeInterface instanceUp = instance;
        instanceUp.method();

        // Downcast
        SomeClass instanceDown = (SomeClass) instanceUp;
        instanceDown.method();
        System.out.println(instanceDown.publicField);
    }
}
