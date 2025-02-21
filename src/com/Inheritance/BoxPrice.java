package com.Inheritance;
public class BoxPrice extends BoxW{

    double cost;

    BoxPrice(BoxW other) {
        super(other); // this will call the constructor made in BoxW class in which we pass an object.
    }

    BoxPrice (double l, double w, double h, double weight, double cost){
        super(l,w,h,weight);
        this.cost = cost;
    }
}
