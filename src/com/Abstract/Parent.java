package com.Abstract;

public abstract class Parent {
    abstract void career(); // Abstract method can not have a body.
    abstract void partner();

    void order(){
        System.out.println("You Will be this");
    }

    abstract void salary(int x);
}

/*
An abstract method is a method that has no implementation (no body).
To declare such a method, the class itself must be abstract.
This is because an abstract method means the class is incomplete and
needs to be subclassed for implementation.
 */

/*
we can pass parameters in an abstract method, just like we
 would in any regular method.
 */