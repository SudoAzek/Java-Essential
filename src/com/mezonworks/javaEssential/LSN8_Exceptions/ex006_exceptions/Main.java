package com.mezonworks.javaEssential.LSN8_Exceptions.ex006_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class UserException extends Exception {
    public void method() {
        System.out.println("My exception!");
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            throw new UserException();
        } catch (UserException userException) {
            System.out.println("Catch user exception.");
            userException.method();

            try {
                FileInputStream fs = new FileInputStream("C:\\NonExistentFileLog.log");
            } catch (FileNotFoundException fileNotFoundException) {
                System.out.println(fileNotFoundException.getMessage());
            }
        }
    }
}
