package com.mezonworks.javaEssential.LSN2_Classes_and_Objects.ex_008_static.methods;

public class Main {
    private int count;

    public static void main(String[] args) {
        Main.doSmth();
        doSmth();

        Main  m = new Main();
        System.out.println(m.count);
    }

    public static void doSmth(){
        System.out.println("Hello !");
    }
}
