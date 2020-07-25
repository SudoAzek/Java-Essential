package com.mezonworks.javaEssential.ex_005_what_is_null;

import com.mezonworks.javaEssential.ex_004_method_calling.Car;

public class MyClass {
    public static void main(String[] args) {
        String str1 = null;
        Car car1 = null;
//        int i = null;
        Integer i2 = null;
//        int i3 = i2;

//        System.out.println(i3);

        String str2 = (String) null;
        Car car2 = (Car) null;

        System.out.println(null == null);
        System.out.println(car1 == null);
//        System.out.println(str1.equals(null));
//        System.out.println(str1.equals(car1));
//        System.out.println(car1.equals(car2));
        System.out.println(car1 == car2);


//        car1.getMaxSpeed();
    }
}
