package com.Enum;
import java.util.Scanner;

enum Planet3 {

    MURCURY(1),
    VENUS(2),
    EARTH(3),
    MARS(4),
    JUPITER(5),
    SATURN(6),
    URANUS(7),
    NEPTUNE(8);

    int value;

    // we can declare constructor in enum.
    Planet3(int value) {
        this.value = value;
    }

    public static Planet3 getPlanet(int value) {
        for(Planet3 planet : Planet3.values()){
            if(value == planet.value){
                return planet;
            }
        }
        return null;
    }

    //we can declare methode in enum
    public void num(Planet3 planet) {
        System.out.println("Order from sun "+planet.value);
    }
}

public class EnumExample3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        Planet3 pl = Planet3.getPlanet(a);
        pl.num(pl);
        sc.close();
    }
}
