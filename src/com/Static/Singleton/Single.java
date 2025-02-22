package com.Static.Singleton;

/*
in a singleton class we can create only one object. That's why , we use private here.
A Singleton Class is a design pattern that ensures only one instance of a class is created and provides a global access 
point to that instance.
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

/*
Key Properties of Singleton
✔ Only one instance of the class exists.
✔ The instance is shared globally.
✔ Private constructor prevents multiple object creation.
✔ Static method provides controlled access.
*/
