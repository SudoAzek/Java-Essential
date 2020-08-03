package com.mezonworks.javaEssential.LSN8_Exceptions.ex012_exceptions;

public class Main {
    public static void main(String[] args) {
        try {
            throw null;
        } catch (NullPointerException nullPointerException) {
            System.out.println(nullPointerException.getMessage());
            System.out.println(nullPointerException.toString());
        }
    }
}
