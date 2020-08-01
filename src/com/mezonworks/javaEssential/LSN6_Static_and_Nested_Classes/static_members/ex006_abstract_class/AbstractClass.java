package com.mezonworks.javaEssential.LSN6_Static_and_Nested_Classes.static_members.ex006_abstract_class;

public abstract class AbstractClass {
    public static AbstractClass CreateObject() {
        return new ConcreteClass();
    }

    public abstract void method();
}
