package com.mezonworks.javaEssential.LSN7_Anonymous_Classes_and_Enums.anonymous.ex004_anonymous_classes;

interface Interface {
    void method();
}

public class Main {
    public static void main(String[] args) {
        int n = 100;

        Interface instance = new Interface() {
            public int publicField = 11;

            @Override
            public void method() {
                publicField = n;
                System.out.println("instance: n = " + publicField);
            }
        };

        instance.method();
    }
}
