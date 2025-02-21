package com.Static.Introduction;

public class Main {
    public static void main(String[] args) {
        // here it will increase as we create new objects

        System.out.println(Human.population);//it will show 0. because no object

        Human Shamiun = new Human("Shamiun Ferdous",21, 7000, false);
        Shamiun.print();
        System.out.println(Human.population); // here it will show 1, because one object.

        Human Iniesta = new Human("Andres Iniesta",42, 1000000, true);
        Iniesta.print();
        System.out.println(Human.population);// here it will show 2, because two objects.

    }
}