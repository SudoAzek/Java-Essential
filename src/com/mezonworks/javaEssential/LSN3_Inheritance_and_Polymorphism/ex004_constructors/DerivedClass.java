package com.mezonworks.javaEssential.LSN3_Inheritance_and_Polymorphism.ex004_constructors;

public class DerivedClass extends BaseClass {
    public int derivedField;

    // Default Constructor
    public DerivedClass() {
    }

    public DerivedClass(int number1, int number2) {
        super(number1);
        derivedField = number2;
    }
}
