package com.Interface;

public class Audi implements Brak,Engine,Tier{

    @Override
    public void brak() {
        System.out.println("We have break of Audi");
    }

    @Override
    public void start() {
        System.out.println("Audi engine starts");
    }

    @Override
    public void stop() {
        System.out.println("Audi engine stops");
    }

    @Override
    public void tier() {
        System.out.println("We have Audi tier");
    }
}
