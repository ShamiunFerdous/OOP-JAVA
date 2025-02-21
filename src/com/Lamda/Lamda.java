package com.Lamda;

import java.util.ArrayList;

public class Lamda {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            list.add(i);
        }
        list.forEach(item->System.out.println(item*2));
    }
}



/*
It represents instances of functional interfaces (interfaces with a single abstract method).
They provide a concise way to express instances of single-method interfaces using a block of code.

A lambda expression has three parts:
(parameters) -> { body }
Parameters: The input arguments (can be omitted if none).
Arrow (->): Separates parameters and body.
Body: The logic to be executed (can be a single line or a block).
 */