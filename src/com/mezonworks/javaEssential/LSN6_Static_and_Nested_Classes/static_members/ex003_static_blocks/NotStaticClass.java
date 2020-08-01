package com.mezonworks.javaEssential.LSN6_Static_and_Nested_Classes.static_members.ex003_static_blocks;

public class NotStaticClass {
    public static final int X;

    // Static block
    static {
        X = 10;
        System.out.println("Static block X: " + X);
    }

    public NotStaticClass() {
//        X = 4; // Error: static block is invoked earlier than Constructor
        System.out.println("Constructor X: " + X);
    }
}
