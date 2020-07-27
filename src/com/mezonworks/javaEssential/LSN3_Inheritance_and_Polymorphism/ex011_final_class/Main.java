package com.mezonworks.javaEssential.LSN3_Inheritance_and_Polymorphism.ex011_final_class;

final class FinalClass {
    public int x;
    public int y;
}

class DerivedClass { // extends FinalClass { // Error
}

public class Main {
    public static void main(String[] args) {
        FinalClass instance = new FinalClass();
        instance.x = 100;
        instance.y = 200;

        System.out.println("x = " + instance.x + ", y = " + instance.y);
    }
}
