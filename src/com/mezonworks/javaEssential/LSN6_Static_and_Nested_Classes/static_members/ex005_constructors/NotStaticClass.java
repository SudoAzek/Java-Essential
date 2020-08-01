package com.mezonworks.javaEssential.LSN6_Static_and_Nested_Classes.static_members.ex005_constructors;

public class NotStaticClass {
    public NotStaticClass() {
        System.out.println("Constructor.");
    }

    static {
        System.out.println("Static block.");
    }

    public static void staticMethod() {
        System.out.println("Static method.");
    }

    public void notStaticMethod() {
        System.out.println("Not static method.");
    }
}
