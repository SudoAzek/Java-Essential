package com.mezonworks.javaEssential.LSN8_Exceptions.ex004_exceptions;

class MyClass {
    public void myMethod() throws Exception {
        Exception exception = new Exception("My exception");
        throw exception;
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            MyClass instance = new MyClass();
            instance.myMethod();
        } catch (Exception e) {
            System.out.println("Message: " + e.getMessage());
            System.out.println("Stack trace: ");
            e.printStackTrace();
        } finally {
            System.out.println("Always executed");
        }
    }
}
