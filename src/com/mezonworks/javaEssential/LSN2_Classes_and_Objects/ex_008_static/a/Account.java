package com.mezonworks.javaEssential.LSN2_Classes_and_Objects.ex_008_static.a;

public class Account {
    double USD;
    String name;
    static double rateKRWtoUSD;

    public static void main(String[] args) {
        Account.rateKRWtoUSD = 0.00083;
        
        Account a1 = new Account();
        a1.name = "Robert";
        a1.USD = 3000.05;

        Account a2 = new Account();
        a2.name ="Edward";
        a2.USD = 1550.75;
    }
}
