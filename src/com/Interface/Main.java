package com.Interface;

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.tier();
        c.brak();
        c.start();
        c.stop();
    }
}

/*
Interfaces define methods without providing their implementation.
Classes that implement the interface must provide the method bodies.

Declared using the interface keyword.
Methods in interfaces are abstract by default.

In Java, when a class implements an interface, the class is required
to provide an implementation for all the abstract methods declared in
the interface, unless the class itself is abstract.
 */