package com.mezonworks.javaEssential.LSN3_Inheritance_and_Polymorphism.ex005_inheritance;

public class Main {
    public static void main(String[] args) {
        DerivedClass instance = new DerivedClass();

        instance.field1 = 1;
        instance.field2 = 2;
        instance.field3 = 3;

        instance.field4 = 4;
        instance.field5 = 5;

        BaseClass newInstance = (BaseClass) instance; // Upcast

        System.out.println(newInstance.field1);
        System.out.println(newInstance.field2);
        System.out.println(newInstance.field3);

//        System.out.println(newInstance.field4);
//        System.out.println(newInstance.field5);

        // Check
        System.out.println("instance ID: " + instance.hashCode());
        System.out.println("newInstance ID: " + newInstance.hashCode());
    }
}
