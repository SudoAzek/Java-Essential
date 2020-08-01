package com.mezonworks.javaEssential.LSN6_Static_and_Nested_Classes.nested_classes.ex001_innerclasses;

class MyClass {
    public class Inner {
        public void method() {
            System.out.println("A method from the Inner class.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass.Inner instance = new MyClass().new Inner();

        instance.method();
    }
}
