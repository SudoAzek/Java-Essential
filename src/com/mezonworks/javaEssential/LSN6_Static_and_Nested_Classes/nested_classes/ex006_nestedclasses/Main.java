package com.mezonworks.javaEssential.LSN6_Static_and_Nested_Classes.nested_classes.ex006_nestedclasses;

class MyClass {
    public static class Nested {
        void say() {
            System.out.println("Hello");
        }
        public static void staticMethodFromNested() {
            System.out.println("A static method of the Nested Class");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass.Nested instance = new MyClass.Nested();
        MyClass.Nested.staticMethodFromNested();
        instance.say();
    }
}
