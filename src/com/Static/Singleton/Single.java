package com.Static.Singleton;

/*
in a singleton class we can create only one object. That's why , we use private here.
 */


class Singleton{

    static int cnt;

    private Singleton(){
        Singleton.cnt += 1;
    }

    public static Singleton hi;

    public static Singleton gethi(){
        //check if the instance is created only once
        if(hi == null){
            hi = new Singleton();
        }
        return hi;
    }

    void print(){
        System.out.println("I am secured");
    }
}

public class Single {
    public static void main(String[] args) {
        Singleton hi1 = Singleton.gethi();
        hi1.print();
        Singleton hi2 = Singleton.gethi();
        Singleton hi3 = Singleton.gethi();
        Singleton hi4 = Singleton.gethi();

        System.out.println(Singleton.cnt);
        // it will show 1, because here all the objects are pointing to one object.
    }
}
