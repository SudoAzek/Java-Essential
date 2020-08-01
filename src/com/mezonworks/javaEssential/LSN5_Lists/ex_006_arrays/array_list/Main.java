package com.mezonworks.javaEssential.LSN5_Lists.ex_006_arrays.array_list;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Name");
        arrayList.add("Surname");

        arrayList.ensureCapacity(30);

        System.out.println(arrayList.size());
        System.out.println(arrayList.get(1));

//        Out of index error:
//        System.out.println(arrayList.get(2));

        System.out.println(arrayList.indexOf("Name"));

        System.out.println(arrayList.lastIndexOf("Surname"));
    }
}
