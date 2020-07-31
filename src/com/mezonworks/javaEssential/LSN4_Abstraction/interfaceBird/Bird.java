package com.mezonworks.javaEssential.LSN4_Abstraction.interfaceBird;

public abstract class Bird implements Creature {

    @Override
    public void live() {
        System.out.println("I can live.");
    }

    public abstract void move();
    public void eat() {
        System.out.println("I can eat.");
    }
}
