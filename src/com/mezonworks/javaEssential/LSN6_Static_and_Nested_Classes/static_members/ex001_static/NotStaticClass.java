package com.mezonworks.javaEssential.LSN6_Static_and_Nested_Classes.static_members.ex001_static;

public class NotStaticClass {
    private int Id;
    public static int field;

    public NotStaticClass(int Id) {
        this.Id = Id;
    }

    public void method() {
        System.out.println("Instance{0}.field = " + Id + ", " + field);
    }
}
