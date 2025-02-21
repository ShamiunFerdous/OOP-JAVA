package com.Constructor;

public class Student {
    String name;
    int roll;
    int age;

    //this is a constructor.
    //The "this" keyword refers to the current object in a method or constructor.
    Student(){
        this.name = "Shamiun";
        this.roll = 42;
        this.age = 21;
    }

    //by this method we can change the variable name of the object.
    public void changename(String name){
        this.name = name;
    }

    // when the argument and variable name is same we have to put this. Otherwise, it won't work
    //object s1 and s2 are indicating this
    Student(String name, int roll, int age){
        this.name = name;
        this.roll = roll;
        this.age = age;
    }


    /*
    You can pass an object as a parameter to a constructor to copy values from one object to another.
    This is useful when you want to create a duplicate object or initialize a new
    object with an existing object's data.
     */
    //object "shami" is indicating this constructor
    Student(Student s){
        this.name = s.name;
        this.roll = s.roll;
        this.age = s.age;
    }
}

/*
Class is the blueprint of an object. It is used to create objects.
No memory is allocated when a class is declared.
 */