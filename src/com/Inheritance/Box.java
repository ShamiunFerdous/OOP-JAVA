package com.Inheritance;
public class Box {
    double l;
    double w;
    double h;

    //create a constructor (passing no parameter)
    Box(){
        this.l = 1;
        this.w = 1;
        this.h = 1;
    }

    //create another constructor (passing one parameter)
    Box(double side){
        this.l = side;
        this.w = side;
        this.h = side;
    }


    //create another constructor (passing three parameters)
    Box(double l, double w, double h){
        this.l = l;
        this.w = w;
        this.h = h;
    }
    // create another constructor (passing an object)
    Box(Box other){
        this.l = other.l + 1;
        this.w = other.w;
        this.h = other.h;
    }


    void print(){
        System.out.println(this.l+" "+this.w+ " "+this.h);
    }
}
