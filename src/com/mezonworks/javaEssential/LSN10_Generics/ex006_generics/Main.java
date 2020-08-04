package com.mezonworks.javaEssential.LSN10_Generics.ex006_generics;

// Bad example. This isn't recommended to do this way.

class MyClass<T> {
    public T add(T a, T b) {
        if(a.getClass().equals(Integer.class)) {
            return (T)(Object) ((Integer) a + (Integer) b);
        }

        if(a.getClass().equals(Double.class)) {
            return (T)(Object) ((Double) a + (Double) b);
        }

        return (T) (Object) 0;
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass<Integer> my = new MyClass<>();
        int sum = my.add(2, 3);
        System.out.println(sum);
    }
}
