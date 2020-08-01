package com.mezonworks.javaEssential.LSN6_Static_and_Nested_Classes.static_members.ex002_static;

public class NotStaticClass {
    private int Id;

    public NotStaticClass(int Id) {
        this.Id = Id;
    }

    public static void method() {
//        System.out.println("Instance.Id = {0} " + Id);

        System.out.println("Can't invoke non-static field.");
    }
}
