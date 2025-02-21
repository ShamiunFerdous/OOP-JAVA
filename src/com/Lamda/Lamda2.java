package com.Lamda;

import java.util.ArrayList;

public class Lamda2 {
    public static void main(String[] args) {

       operation sum = (a, b) -> a + b;
        operation product = (a, b) -> a * b;
        operation subtract = (a, b) -> a - b;

        Lamda2 l = new Lamda2();
        System.out.println(l.operate(2,5,sum));
        System.out.println(l.operate(2,5,product));
        System.out.println(l.operate(2,5,subtract));

    }

    private int operate(int a,int b,operation op){
        return op.operation(a, b);
    }

}
interface operation{
    int operation(int a, int b);
}
