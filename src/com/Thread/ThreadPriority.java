package com.Thread;

// Using setPriority() method to set the priority of the thread. It's just suggestion to the thread scheduler. It's not mandatory to follow the priority of the thread. It depends on the thread scheduler to follow the priority of the thread or not.

// Thread class provides 3 constants for priority:

// 1. public static int MIN_PRIORITY
// 2. public static int NORM_PRIORITY
// 3. public static int MAX_PRIORITY

// Thread class provides 2 methods to get and set the priority of the thread:

// 1. public final int getPriority()
// 2. public final void setPriority(int newPriority)

// The default priority of the thread is 5 (NORM_PRIORITY). The minimum priority of the thread is 1
// (MIN_PRIORITY) and the maximum priority of the thread is 10 (MAX_PRIORITY).

// The thread scheduler uses the priority of the thread to decide which thread will run.
// The thread with the highest priority will get the chance to run first.

// If two threads have the same priority then the thread scheduler uses the first come first
// serves algorithm to decide which thread will run first.

class A extends Thread{
    public void run(){
        for(int i=0; i<100; i++){
            System.out.println("Thread A: " + i);

            System.out.println();

            try{
                Thread.sleep(10);  // Sleep for 1 second
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0; i<100; i++){
            System.out.println("Thread B: " + i);
            System.out.println();
            try{
                Thread.sleep(10);  // Sleep for 1 second
            }catch(InterruptedException e){
                System.out.println(e);

            }

        }
    }
}

public class ThreadPriority{
    public static void main(String[] args) {

        A a = new A();
        B b = new B();

        System.out.println(a.getPriority()); // Default priority is 5
        System.out.println(b.getPriority()); // Default priority is 5

        System.out.println(Thread.MIN_PRIORITY); // 1

        System.out.println(Thread.MAX_PRIORITY); // 10

        System.out.println(Thread.NORM_PRIORITY); // 5

        b.setPriority(Thread.MAX_PRIORITY); // Setting the priority of thread b to MAX_PRIORITY

        a.start();

        try{
            Thread.sleep(5);;

        }catch(InterruptedException e){
            System.out.println(e);
        }
        b.start();


    }
}