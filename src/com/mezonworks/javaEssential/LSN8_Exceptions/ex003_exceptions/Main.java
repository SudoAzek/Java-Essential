package com.mezonworks.javaEssential.LSN8_Exceptions.ex003_exceptions;

public class Main {
    public static void main(String[] args) {
        try {
            throw new Exception("My exception");
        } catch (Exception e) {
            System.out.println("Catch of my exception");
            System.out.println(e.getMessage());
        }
    }
}
