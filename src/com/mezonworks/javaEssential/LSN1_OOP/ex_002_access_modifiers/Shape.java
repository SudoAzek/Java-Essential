package com.mezonworks.javaEssential.LSN1_OOP.ex_002_access_modifiers;

public class Shape {
    private int length;
    private long height;
    public double square;
    public int i;
    public float f;
    public char c;
    public boolean b;

    public Shape() {
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public void viewShape() {
        System.out.println("Height: " + height);
        System.out.println("Length: " + length);
    }
}
