package com.Constructor;

public class Constructor2 {
    public static void main(String[] args) {
        Student student1 = new Student("Shamiun",42,21);

        Student student2 = student1;
        student2.name = "Ferdous";
        student2.age = 23;
        student2.roll = 52;

        System.out.println(student1.name+" "+student1.age+" "+student1.roll);
    }
}
/*
Here student1 and student2 are referring to the same memory location. They are not different objects.
Since both of them are referring to the same object, thus the change affects the both.
The output will be Ferdous 23 52.
 */