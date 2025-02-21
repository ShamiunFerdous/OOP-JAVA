package com.Abstract;

public class Grand extends doug{

    @Override
    void name(String s) {
        System.out.println("The name of Grandson "+ s );
    }

    @Override
    void career() {
        System.out.println("I will be a doctor");
    }

    @Override
    void partner() {
        System.out.println("I Love someone");
    }

    @Override
    void salary(int x) {
        System.out.println("You have to make "+ x +" a month");
    }
}
