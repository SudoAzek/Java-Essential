package com.mezonworks.javaEssential.LSN6_Static_and_Nested_Classes.nested_classes.ex004_innerclasses;

class MyClass {
    public class Inner extends BaseClass {
        public void methodFromInner() {
            System.out.println("A method of the InnerClass");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass.Inner instance = new MyClass().new Inner();

        instance.methodFromBase();
        instance.methodFromInner();
    }
}
