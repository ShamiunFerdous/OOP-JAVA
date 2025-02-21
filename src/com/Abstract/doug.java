package com.Abstract;

public abstract class doug extends Parent {
    abstract void name(String s);
}

/*
An abstract child class does not have to implement the abstract methods of the
parent abstract class.

The abstract child class can still define its own abstract or concrete methods.

The next level subclass (non-abstract class) will be responsible for implementing the
abstract methods from both the parent abstract class and any abstract
methods in the abstract child class.
 */
