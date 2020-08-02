package com.mezonworks.javaEssential.LSN7_Anonymous_Classes_and_Enums.enums.ex004_abstract_methods;

public class Main {
    public static void main(String[] args) {
        Company myCompany = Company.MEZONWORKS;
        System.out.println(myCompany);

        int salary = myCompany.getValue();
        String currency = myCompany.getCurrency();
        System.out.println("I earn " + salary + " " + currency + " in a month.");
    }
}
