package com.mezonworks.javaEssential.LSN2_Classes_and_Objects.ex_008_static.constant;

public class MyCalc {
    private static final float PI_NUMBER;
        // Logical block;
    {
        // Dynamical block;
        // Cannot change a constant
//        PI_NUMBER = 22.1F;
    }

    static {
        // Static block
        PI_NUMBER = 22.1F;
    }
}
