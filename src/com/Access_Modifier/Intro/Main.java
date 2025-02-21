package com.Access_Modifier.Intro;

public class Main {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        c c = new c();
        System.out.println(a.a);
        System.out.println(b.b);
        /*System.out.println(c.c); will show error. because c is private
        and it's in a different class.
         */
        c.getC();
        //but we can get the access through this.

    }
}