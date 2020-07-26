package com.mezonworks.javaEssential.LSN3_Inheritance_and_Polymorphism.ex002_inheritance;

public class BaseClass {
    // Default field
    String defaultField = "BaseClass.defaultField";

    // Public field
    public String publicField = "BaseClass.publicField";

    // Private field
    private String privateField = "BaseClass.privateField";

    // Protected field
    protected String protectedField = "BaseClass.protectedField";

    public void show() {
        System.out.println(privateField);
    }
}
