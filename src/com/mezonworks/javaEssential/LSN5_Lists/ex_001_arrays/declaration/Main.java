package com.mezonworks.javaEssential.LSN5_Lists.ex_001_arrays.declaration;

public class Main {
    public static void main(String[] args) {
        int[] arr1;
        int arr2[]; // Not recommended
        arr1 = new int[5];
        int[] arr3 = new int[100];

        int[] arr4 = {12, 25, 33,94, 17, 65}; // Size of an array

        System.out.println(arr4.length); // Length of an array
    }
}
