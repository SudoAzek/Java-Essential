package com.mezonworks.javaEssential.LSN8_Exceptions.ex002_exceptions;

public class Main {
    public static void main(String[] args) {
        Exception ex = new Exception("My Exception");

        try {
            throw ex;
        } catch (Exception e) {
            System.out.println("Catch of an exception.");
            System.out.println(e.getMessage());
        }
    }
}
