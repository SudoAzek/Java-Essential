package com.mezonworks.javaEssential.LSN6_Static_and_Nested_Classes.static_members.ex003_static_blocks;

public class Main {
    public static void main(String[] args) {
        System.out.println(NotStaticClass.X);

        NotStaticClass instance = new NotStaticClass();
        System.out.println(instance.X);
    }
}
