package com.Package.Shamiun.First;

import com.Package.Shamiun.Second.Msg;

public class Greetings {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Msg msg = new Msg();
        msg.message();

        /*
        Here we can access the method that call in package Second by importing it. We can
        also create of objects of the class of that package.
         */
    }
}
