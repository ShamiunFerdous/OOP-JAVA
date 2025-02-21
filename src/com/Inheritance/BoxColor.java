package com.Inheritance;
public class BoxColor extends BoxW{
    String color;

    BoxColor(BoxW other){
      super(other);
    }
    public BoxColor(double l, double h, double w,double weight, String color){
        super(l,h,w,weight);
        this.color = color;
    }
}
