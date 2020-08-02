package com.mezonworks.javaEssential.LSN7_Anonymous_Classes_and_Enums.anonymous.test;

public class Mobile extends Computer {
    Phone createPhone() {
        return new Phone() {
            @Override
            void process() {
                super.process();
                System.out.println("Mobile");
            }
        };
    }
    @Override
    void process() {
        super.process();
        System.out.println("Mobile");
    }
}
