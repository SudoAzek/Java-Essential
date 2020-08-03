package com.mezonworks.javaEssential.LSN8_Exceptions.ex005_exceptions;

class UserException extends Exception {
    public void method() {
        System.out.println("My exception!");
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            throw new UserException();
        } catch (UserException e) {
            System.out.println("Catch my exception.");
            e.method();
        }
    }
}
