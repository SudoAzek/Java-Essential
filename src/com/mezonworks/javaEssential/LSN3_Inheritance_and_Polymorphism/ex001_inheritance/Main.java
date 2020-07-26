package com.mezonworks.javaEssential.LSN3_Inheritance_and_Polymorphism.ex001_inheritance;

public class Main {
    public static void main(String[] args) {
        DerivedClass instance = new DerivedClass();
        System.out.println(instance.publicField);
        System.out.println(instance.protectedField);
        System.out.println(instance.defaultField);
//        System.out.println(instance.privateField);

        BaseClass baseInstance = new BaseClass();
        System.out.println(baseInstance.protectedField);
    }
}
