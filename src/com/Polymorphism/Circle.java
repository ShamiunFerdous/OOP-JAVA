package com.Polymorphism;

public class Circle extends Shape{

    @Override
        /*this is called annotation(it's check if the method is
        overriding or not, if not then it will give error)
         */
    void print(){
        System.out.println("I am in circle. Area = pie*r*r .");
    }
}
