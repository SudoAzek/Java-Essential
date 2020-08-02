package com.mezonworks.javaEssential.LSN7_Anonymous_Classes_and_Enums.anonymous.ex003_anonymous_classes;

interface Interface1 {
    void method();
}

public class Main {
    public static void main(String[] args) {
        Interface1 instance = new Interface1() {
            public int publicField = 3;

            @Override
            public void method() {
                publicField = 1994;
                System.out.println("instance1: publicField = " + getPublicField());
            }

            public int getPublicField() {
                return publicField;
            }
        };

        instance.method();

        // Anonymous fields aren't available
//        System.out.println(instance.getPublicField());
    }
}
