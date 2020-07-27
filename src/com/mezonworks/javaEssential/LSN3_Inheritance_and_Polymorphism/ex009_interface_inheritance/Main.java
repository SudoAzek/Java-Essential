package com.mezonworks.javaEssential.LSN3_Inheritance_and_Polymorphism.ex009_interface_inheritance;

public class Main {
    public static void main(String[] args) {
        SomeClass instance = new SomeClass();
        instance.method1();

        // Upcast
        SomeInterface1 instanceUp1 = instance;
        instanceUp1.method1();
//        instanceUp1.method2(); // Error
//        instanceUp1.method3(); // Error

        // Upcast
        SomeInterface2 instanceUp2 = instance;
//        instanceUp2.method1(); // Error
        instanceUp2.method2();
//        instanceUp2.method3(); // Error

        // Upcast
        SomeInterface3 instanceUp3 = instance;
//        instanceUp3.method1(); // Error
//        instanceUp3.method2(); // Error
        instanceUp3.method3();

        // DownCast
        SomeClass instanceDown = (SomeClass) instanceUp1;
        instanceDown.method1();
    }
}
