package com.Object_Cloning;

class Student implements Cloneable {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Calls Object's clone() to create a copy
    }
}

public class CloneExample {
    public static void main(String[] args) {
        try {
            Student s1 = new Student("Shamiun", 21);
            Student s2 = (Student) s1.clone(); // Cloning s1 into s2

            System.out.println(s1.name + " - " + s1.age);
            System.out.println(s2.name + " - " + s2.age);
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported!");
        }
    }
}

/*
The exception occurs

1️⃣ If the class does NOT implement Cloneable
2️⃣ If clone() is not overridden and called directly
3️⃣ If a subclass calls super.clone() but the parent class doesn’t implement Cloneable

 */