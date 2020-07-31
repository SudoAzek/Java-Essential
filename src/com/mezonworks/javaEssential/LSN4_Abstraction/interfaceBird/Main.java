package com.mezonworks.javaEssential.LSN4_Abstraction.interfaceBird;

public class Main {
    public static void main(String[] args) {
//        Bird b = new Bird(); // b.move();
        Bird p = new Penguin();
        Bird s = new Strauss();
        Bird sw = new Swallow();

        p.move();
        p.eat();
        s.move();
        sw.move();
    }
}
