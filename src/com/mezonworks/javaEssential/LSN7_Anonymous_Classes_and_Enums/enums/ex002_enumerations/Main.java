package com.mezonworks.javaEssential.LSN7_Anonymous_Classes_and_Enums.enums.ex002_enumerations;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Main {
    public static void main(String[] args) {
        Day today = Day.SATURDAY;

        switch (today) {
            case SATURDAY:
                System.out.println("The first day of the weekend is - " + Day.SATURDAY);
                break;
            case SUNDAY:
                System.out.println("The last day of the weekend is - " + Day.SUNDAY);
                break;
            default:
                System.out.println("The weekday - " + today);
        }

        if(today == Day.SATURDAY) {
            System.out.println("Finally, weekend!");
        }
    }
}