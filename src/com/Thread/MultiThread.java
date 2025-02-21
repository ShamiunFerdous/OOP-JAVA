package com.Thread;

class thread1 extends Thread{
    public void run(){
        int i =0;
        while(i<100){
            System.out.println("I am happy :)");
            i++;
        }
    }
}

class thread2 extends thread1{
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("I am sad :(");
            i++;
        }
    }
}

class thread3 extends thread2{
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("I am confused");
            i++;
        }
    }
}
public class MultiThread {
    public static void main(String[] args) {
        thread1 thread1 = new thread1();
        thread2 thread2 = new thread2();
        thread3 thread3 = new thread3();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
