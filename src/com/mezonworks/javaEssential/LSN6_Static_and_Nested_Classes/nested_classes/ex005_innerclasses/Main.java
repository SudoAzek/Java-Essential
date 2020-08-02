package com.mezonworks.javaEssential.LSN6_Static_and_Nested_Classes.nested_classes.ex005_innerclasses;

class MyClass extends BaseClass {
//    @Override
//    public void methodFromBase() {
//        System.out.println("A method of the BaseClass overridden in MyClass");
//    }

    public class Inner {
        public void methodFromInner() {
            System.out.println("A method of the InnerClass");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass instance1 = new MyClass();
        instance1.methodFromBase();

        MyClass.Inner instance2 = new MyClass().new Inner();
        instance2.methodFromInner();
    }
}
