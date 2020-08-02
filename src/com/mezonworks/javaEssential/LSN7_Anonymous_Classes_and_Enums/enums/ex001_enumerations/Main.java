package com.mezonworks.javaEssential.LSN7_Anonymous_Classes_and_Enums.enums.ex001_enumerations;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Main {
    public static void main(String[] args) {
        Day today = Day.SUNDAY;
        System.out.println("Today is " + today);

        int number = 4;

//        today = number;
//        today = 4;
    }
}
