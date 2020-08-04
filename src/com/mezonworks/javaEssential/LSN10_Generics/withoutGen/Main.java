package com.mezonworks.javaEssential.LSN10_Generics.withoutGen;


public class Main {
    public static void main(String[] args) {
        withoutGen w1 = new withoutGen("Test");
        withoutGen w2 = new withoutGen(1994);
        withoutGen w3 = new withoutGen(new Cat("PussyCat"));

        w1.display();
        w2.display();
        w3.display();

//        w1 = w2;

        String s = (String) w1.getObj();
        System.out.println(s);
    }
}

class withoutGen {
    Object obj;

    withoutGen(Object obj) {
        this.obj = obj;
    }

    void display() {
        System.out.println(obj);
    }

    Object getObj() {
        return this.obj;
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
