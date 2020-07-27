package com.mezonworks.javaEssential.LSN3_Inheritance_and_Polymorphism.ex011_final_methods;

class ClassA {
    public void method1() {
        System.out.println("ClassA.method1");
    }

    public void method2() {
        System.out.println("ClassA.method2");
    }
}

class ClassB extends ClassA {
    @Override
    public final void method1() {
        System.out.println("ClassB.method1");
    }

    @Override
    public void method2() {
        System.out.println("ClassB.method2");
    }
}

class ClassC extends ClassB {
    // Trying to override method1 from ClassB causes error because of the final.
//    @Override
//    public final void method1() {
//        System.out.println("ClassC.method1");
//    }

    @Override
    public void method2() {
        System.out.println("ClassC.method2");
    }
}

public class Main {
    public static void main(String[] args) {
        ClassA instanceA = new ClassA();
        instanceA.method1();
        instanceA.method2();

        System.out.println("---------------");

        ClassB instanceB = new ClassB();
        instanceB.method1();
        instanceB.method2();

        System.out.println("---------------");

        ClassC instanceC = new ClassC();
        instanceC.method1();
        instanceC.method2();
    }
}
