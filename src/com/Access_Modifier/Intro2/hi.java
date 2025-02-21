package com.Access_Modifier.Intro2;

import com.Access_Modifier.Intro.A;
import com.Access_Modifier.Intro.B;
import com.Access_Modifier.Intro.c;

public class hi {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        c c = new c();

        System.out.println(a.a);

        /*System.out.println(b.b);
        System.out.println(c.c);

        this will show error.
        Because b is protected and c is private.
         */
        c.getC(); // this will run, as getC is a public method.
    }
}
