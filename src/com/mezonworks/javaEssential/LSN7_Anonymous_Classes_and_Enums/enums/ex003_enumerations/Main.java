package com.mezonworks.javaEssential.LSN7_Anonymous_Classes_and_Enums.enums.ex003_enumerations;

enum Company {
    MEZONWORKS(1000), GOOGLE(100), SKYNET(100); // TEST, TEST(1000, "string"); // Error
    private int value;
    Company(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}

public class Main {
    public static void main(String[] args) {
        Company myComp = Company.MEZONWORKS;
        System.out.println("I work in a company called " + myComp + ", and get " + myComp.getValue() + "$ per month.");
    }
}
