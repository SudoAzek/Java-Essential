package com.mezonworks.javaEssential.LSN5_Lists.ex_005_arrays.array_list;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Declaration of arrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Adding elements to list
        arrayList.add("Hello");
        arrayList.add("student");
        arrayList.add("Azamat Ochilov");

        System.out.println(arrayList);

        // Adding elements by index
        arrayList.add(0, "Hola");
        arrayList.remove(1);
        arrayList.remove("Azamat Ochilov");

        System.out.println(arrayList);
    }
}
