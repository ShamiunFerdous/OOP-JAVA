package com.Thread;

class Mythr1 extends Thread {
    public Mythr1(String name) {
        super(name);
    }

    public void run() {
        System.out.println(getName() + " is running");
    }
}

public class ThreadConstructor {
    public static void main(String[] args) {
        Mythr1 t1 = new Mythr1("mythr1");
        Mythr1 t2 = new Mythr1("mythr2");
        Mythr1 t3 = new Mythr1("mythr3");

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Thread Name: " + t1.getName());
        System.out.println("Thread Priority: " + t1.getPriority());
        System.out.println("Thread State: " + t1.getState());
        System.out.println("Thread ID: " + t1.getId());
    }
}
