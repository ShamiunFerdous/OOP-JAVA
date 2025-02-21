package com.Abstract;

public class Son extends Parent{

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

/*
All the abstract method we created in the parent class, all of them have to be
implemented in the child class.

A child class can inherit from only one abstract class directly
 */
