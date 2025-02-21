package com.Static.Introduction;

public class Human {
    String name;
    int age;
    int salary;
    boolean married;

    static int population;  /*this is a static variable. it's not depends on the objects,
    it is dependent on the class.*/

    public Human(String s, int a, int b, boolean m) {
        this.name = s;
        this.age = a;
        this.salary = b;
        this.married = m;
        //the way to write the static variable inside an constructor
        Human.population += 1;
        /* Here we can write it "this.population" like this also, but it's not
        the convenient way to write. Though it will also work.
         */
    }

    void print(){
        System.out.println(name+"   "+age+"   "+salary+"   "+married);
    }
}
