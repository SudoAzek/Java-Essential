package com.mezonworks.javaEssential.LSN6_Static_and_Nested_Classes.static_members.ex002_static;

public class Main {
    public static void main(String[] args) {
        NotStaticClass instance = new NotStaticClass(1);
        NotStaticClass.method();
    }
}
