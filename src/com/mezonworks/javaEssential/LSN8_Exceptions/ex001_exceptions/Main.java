package com.mezonworks.javaEssential.LSN8_Exceptions.ex001_exceptions;

public class Main {
    public static void main(String[] args) {
        int a = 1, n = 2;

        try {
            // Trying division by zero exception
            a = a / (2 - n);
            System.out.println("a = " + a);
        } catch (Exception e) {
            System.out.println("Solution for the exception");
//            e.printStackTrace();
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
    }
}
