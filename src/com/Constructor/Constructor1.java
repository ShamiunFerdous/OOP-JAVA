package com.Constructor;

public class Constructor1 {
    public static void main(String[] args) {

        //create some objects of Student class
        //here Student() is constructor
        //And this by default constructor

        Student s1 = new Student("Shamiun",42,21);
        Student s2 = new Student("Iniesta",8,43);

        Student shamiun = new Student();
        System.out.println(shamiun.name + " " + shamiun.age+ " "+shamiun.roll);

        shamiun.changename("Ferdous");
        System.out.println(shamiun.name); //name will be changed.

        Student shami = new Student(shamiun);
        System.out.println(shami.name + " " + shami.age+ " "+shami.roll);
    }
}

/*

An object is an instance of the class.
Memory is allocated as soon as an object is created.


A constructor in Java is a special method that is used to initialize objects. The constructor is called when
an object of a class is created. It can be used to set initial values for object attributes.
 */