package com.mezonworks.javaEssential.LSN3_Inheritance_and_Polymorphism.bird;

public class Main {
    public static void main(String[] args) {
        Bird s = new Strauss();
        Bird p = new Penguin();
        Bird sw = new Swallow();
        Bird b = new Bird();
        Bird[] arr = {s, p, sw, b};

        for(Bird temp : arr) {
            temp.move();
        }
    }
}
