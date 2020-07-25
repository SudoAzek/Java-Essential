package com.mezonworks.javaEssential.ex_002_access_modifiers;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();

//        System.out.println(shape.i);
//        System.out.println(shape.f);
//        System.out.println(shape.c);
//        System.out.println(shape.b);
        System.out.println(shape);

        shape.square = 24.0;
        System.out.println(shape.square);

        shape.setHeight(200);
//        System.out.println(shape.getHeight());

        shape.setLength(144);
//        System.out.println(shape.getLength());

        shape.viewShape();
    }
}
