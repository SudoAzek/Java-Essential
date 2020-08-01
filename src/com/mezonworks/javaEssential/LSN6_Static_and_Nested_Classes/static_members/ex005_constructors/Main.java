package com.mezonworks.javaEssential.LSN6_Static_and_Nested_Classes.static_members.ex005_constructors;

public class Main {
    public static void main(String[] args) {
        NotStaticClass nc = new NotStaticClass();
        // 1st case. Only static members and methods are invoked.
        NotStaticClass.staticMethod();
        // 2nd case. Invoked both with constructor.
        new NotStaticClass().notStaticMethod();
    }
}
