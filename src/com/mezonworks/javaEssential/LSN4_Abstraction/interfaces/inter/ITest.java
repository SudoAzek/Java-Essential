package com.mezonworks.javaEssential.LSN4_Abstraction.interfaces.inter;

public interface ITest extends I1, I2 {
    public static final int PRICE = 10;
    public abstract void move();

    static int sum() {
        return 10 + 5;
    }

    default int mul() {
        return 10 + 2;
    }
}

interface I1 {
    void eat();
}

interface I2 {

}
