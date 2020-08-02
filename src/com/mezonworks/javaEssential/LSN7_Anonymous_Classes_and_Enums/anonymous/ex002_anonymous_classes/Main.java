package com.mezonworks.javaEssential.LSN7_Anonymous_Classes_and_Enums.anonymous.ex002_anonymous_classes;

interface Interface1 {
    void method();
}

public class Main {
    public static void main(String[] args) {
        Interface1 instance = new Interface1() {
            public double d = 1.3;
            protected String str = "Anonymous class";
            private int num = 10;

            @Override
            public void method() {
                num = 1994;
                System.out.println("instance1: d = " + d + ", str = " + str + ", num = " + num);
            }
        };

        instance.method();

        // Fields aren't available
//        System.out.println(instance.d);
    }
}
