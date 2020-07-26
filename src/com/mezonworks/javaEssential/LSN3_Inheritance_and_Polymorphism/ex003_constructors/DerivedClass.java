package com.mezonworks.javaEssential.LSN3_Inheritance_and_Polymorphism.ex003_constructors;

public class DerivedClass extends BaseClass {
    public int derivedField;

    public DerivedClass(int number1, int number2) {
        baseNumber = number1;
        derivedField = number2;
    }
}
