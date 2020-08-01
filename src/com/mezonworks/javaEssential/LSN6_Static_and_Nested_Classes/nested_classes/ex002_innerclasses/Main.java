package com.mezonworks.javaEssential.LSN6_Static_and_Nested_Classes.nested_classes.ex002_innerclasses;

class MyClass {
    private static int field = 10;

    public class Inner {
        public void method(int a) {
            field = a;

            System.out.println(field);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass.Inner instance = new MyClass().new Inner();

        instance.method(1994);
    }
}
