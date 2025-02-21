package com.Generics;

import java.util.Arrays;
import java.util.Scanner;

public class CustomArraylist {

    private int[] array;
    private int size = 0;
    private int DEFAULT_SIZE = 10;

    CustomArraylist() {
        this.array = new int[DEFAULT_SIZE];
    }

    public void add(int a){
        if(isFull()){
            resiz();
        }

        array[size++] = a;
    }

    public boolean isFull(){
        return size == array.length;
    }

    public void resiz(){
        int[] temp = new int[2*array.length];

        for(int i = 0; i < size; i++){
            temp[i] = array[i];
        }
        array = temp;
    }

    public int remove(){
        return array[--size];
    }

    public int get(int index){
        return array[index];
    }

    public int size(){
        return size;
    }

    public void set(int a, int id){
        array[id] = a;
    }

    public String toString(){
        return Arrays.toString(array);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomArraylist arraylist = new CustomArraylist();

        for(int i = 0; i<5; i++){
            int a;
            a = sc.nextInt();
            arraylist.add(a);
        }

        System.out.println(arraylist);
    }
}
