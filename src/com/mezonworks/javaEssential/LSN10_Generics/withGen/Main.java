package com.mezonworks.javaEssential.LSN10_Generics.withGen;

public class Main {
    public static void main(String[] args) {
        withGen<String> w1 = new withGen<>("Test");
        withGen<Integer> w2 = new withGen<>(1994);
        withGen<Cat> w3 = new withGen<>(new Cat("PussyCat"));

//        w1 = w2;

        w1.display();
        w2.display();
        w3.display();
    }
}

class withGen<T> {
    T obj;

    withGen(T obj) {
        this.obj = obj;
    }

    void display() {
        System.out.println(obj);
    }
}

class Cat {
    String name;

    Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
