package com.Enum;

import java.util.Scanner;

interface name{

   static void getName(int n){

    }
}

enum Planet4 implements name{
    MURCURY(1),
    VENUS(2),
    EARTH(3),
    MARS(4),
    JUPITER(5),
    SATURN(6),
    URANUS(7),
    NEPTUNE(8);

    int val;

    Planet4(int val) {
        this.val = val;
    }

    public static void getName(int a){
        for(Planet4 p : Planet4.values()){
            if(p.val == a){
                System.out.println("The name is " + p);
            }
        }
    }

}

public class EnumExample4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        Planet4.getName(a);
    }
}
