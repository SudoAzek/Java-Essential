package com.mezonworks.javaEssential.LSN8_Exceptions.ex011_exceptions;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6};
        int a = 5, b = 0;

        try {
            System.out.println(arr[8]);
            System.out.println(a/b);
        } catch(Exception e) {
            System.out.println(e.toString());
            System.out.println(e.toString());
//            System.out.println(e.getMessage());
        }
    }
}
