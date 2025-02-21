package com.Exception;

import java.io.BufferedReader;
import java.io.FileReader;

public class Exception2 {
    public static void main(String[] args) {
        /*
        throw Keyword (Manually Throwing an Exception)
        The throw keyword is used inside a method or block to explicitly throw an exception.
        It can throw both built-in and custom exceptions.
        Only one exception can be thrown at a time.
         */
        int age = 17;
        // this will show exception. But if we say age = 19.
        // it will show You can vote.
        try{
            if (age < 18) {
                throw new IllegalArgumentException("Not eligible to vote.");
            }
            System.out.println("You can vote.");
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught."+e);
        }

        /*
        throws Keyword (Declaring Exceptions)
        The throws keyword is used in method signatures to declare that a method may throw an exception.
        It does not handle the exception but pushes responsibility to the caller.
        It can declare multiple exceptions, separated by commas.
        */

        try{
            readfile();
        } catch (Exception e) {
            System.out.println("Exeception : "+e);
        }


    }

    public static void readfile() throws Exception{
        FileReader file = new FileReader("hi.txt");
        System.out.println("You are reading file.");
    }
}
