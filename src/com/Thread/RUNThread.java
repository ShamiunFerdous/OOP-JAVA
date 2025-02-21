package com.Thread;

class th1 implements Runnable {
    public void run() {
        System.out.println("Hello world");
    }
}

class th2 implements Runnable {
    public void run() {
        System.out.println("Thank you!!");
    }
}

class th3 implements Runnable {
    public void run() {
        System.out.println("You're welcome.");
    }
}
public class RUNThread {
    public static void main(String[] args) {
        th1 th1 = new th1();
        Thread t1 = new Thread(th1);

        th2 th2 = new th2();
        Thread t2 = new Thread(th2);

        th3 th3 = new th3();
        Thread t3 = new Thread(th3);

        t1.start();
        t2.start();
        t3.start();
    }
}
