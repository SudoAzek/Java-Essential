package com.mezonworks.javaEssential.LSN7_Anonymous_Classes_and_Enums.anonymous.test;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();

        Computer computer1 = new Computer();
        Computer computer2 = new Computer();

        Mobile mobile1 = new Mobile();
        Mobile mobile2 = new Mobile();

        Computer[] c = {computer1, computer2, mobile1};
        Phone[] p = {phone1, phone2, mobile2.createPhone()};

        for (Computer temp: c) {
            temp.process();
        }
        System.out.println("---------------------");

        for (Phone temp: p) {
            temp.process();
        }
    }
}
