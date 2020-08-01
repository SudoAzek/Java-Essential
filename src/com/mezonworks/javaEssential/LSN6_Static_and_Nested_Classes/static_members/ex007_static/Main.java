package com.mezonworks.javaEssential.LSN6_Static_and_Nested_Classes.static_members.ex007_static;

abstract class BaseClass {
//    public abstract static void abstractStaticMethod(); // Error

    public static void staticMethod() {
        System.out.println("BaseClass.staticMethod");
    }
}

class DerivedClass extends BaseClass {
//    @Override // Error:
    public static void staticMethod() {
        System.out.println("DerivedClass.staticMethod");
    }
}

public class Main {
    public static void main(String[] args) {
        BaseClass.staticMethod();
        DerivedClass.staticMethod();
    }
}
