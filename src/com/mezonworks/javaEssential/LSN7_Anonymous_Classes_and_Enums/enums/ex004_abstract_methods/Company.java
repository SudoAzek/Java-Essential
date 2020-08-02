package com.mezonworks.javaEssential.LSN7_Anonymous_Classes_and_Enums.enums.ex004_abstract_methods;

import com.mezonworks.javaEssential.LSN7_Anonymous_Classes_and_Enums.anonymous.test.Computer;

public enum Company {
    MEZONWORKS(1000) {
        @Override
        public int getValue() {
            return 10 + this.value;
        }

        @Override
        public String getCurrency() {
            return "dollars";
        }
    }, GOOGLE(100) {

        @Override
        public String getCurrency() {
            return "cents";
        }
    }, SKYNET(10) {
        @Override
        public String toString() {
            return "Company: " + super.toString();
        }

        @Override
        public String getCurrency() {
            return "euros";
        }
    }; //, TEST, TEST(1000, "string"); // Error

    int value;

    Company(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Company: " + super.toString() + ", salary = " + getValue() + " " + getCurrency();
    }

    public int getValue() {
        return value;
    }

    public abstract String getCurrency();
}
