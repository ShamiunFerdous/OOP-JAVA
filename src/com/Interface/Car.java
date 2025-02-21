package com.Interface;

public class Car implements Engine,Brak, Tier {

    @Override
    public void brak() {
        System.out.println("I break like normal car");
    }

    @Override
    public void start() {
        System.out.println("I start engine like normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop engine like normal car");
    }

    @Override
    public void tier() {
        System.out.println("I have best tiers");
    }
}

/*
A class can implement multiple interfaces, allowing it to inherit
behaviors from multiple sources, a feature often used as an
alternative to multiple inheritance.
 */
