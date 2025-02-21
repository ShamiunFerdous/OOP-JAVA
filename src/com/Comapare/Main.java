package com.Comapare;

public class Main {
    public static void main(String[] args) {
        Student a = new Student(1, 95.6F);
        Student b = new Student(2, 92.6F);

        if(a.compareTo(b) > 0){
            System.out.println("a is greater than b");
        }
        else if(a.compareTo(b) < 0){
            System.out.println("a is less than b");
        }
        else{
            System.out.println("Both are equal");
        }

    }
}
