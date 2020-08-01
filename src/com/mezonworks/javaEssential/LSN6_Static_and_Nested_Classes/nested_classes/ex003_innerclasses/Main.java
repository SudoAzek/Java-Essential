package com.mezonworks.javaEssential.LSN6_Static_and_Nested_Classes.nested_classes.ex003_innerclasses;

class MyClass {
    private int field = 0;

    public class Inner {
        MyClass instance = new MyClass();

        public void method(int a) {
            instance.field = a;

            System.out.println(instance.field);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass.Inner inner = new MyClass().new Inner();

        inner.method(1994);
    }
}
