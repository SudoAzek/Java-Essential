package com.mezonworks.javaEssential.LSN10_Generics.Bird;

public class Main {
    public static void main(String[] args) {
        Strauss[] s = {new Strauss(55), new Strauss(60) };
        Penguin[] p = {new Penguin(15), new Penguin(18), new Penguin(20) };

        Logic<Strauss> s1 = new Logic<>(s);
        s1.display();

        Logic<Penguin> p1 = new Logic<>(p);
        p1.display();

        System.out.println(s1.weightController());
        System.out.println(p1.weightController());

        Logic.weightDifference(s1, p1);
    }
}

class Bird {
    int weight;

    Bird(int weight) {
        this.weight = weight;
    }

    void move() {

    }
}

class Strauss extends Bird {
    Strauss(int weight) {
        super(weight);
    }

    @Override
    void move() {
        System.out.println("Run");
    }
}

class Penguin extends Bird {
    Penguin(int weight) {
        super(weight);
    }

    @Override
    void move() {
        System.out.println("Swim");
    }
}

class Logic<T extends Bird> {
    T[] array;

    Logic(T[] array) {
        this.array = array;
    }

    void display() {
        for (T temp : array) {
            temp.move();
            System.out.println(temp.weight);
        }
    }

    int weightController() {
        int sum = 0;
        for(T temp : array) {
            sum += temp.weight;
        }
        return sum;
    }

    static void weightDifference(Logic<?> c1, Logic<?> c2) {
        System.out.println(c1.weightController() - c2.weightController());
    }
}

