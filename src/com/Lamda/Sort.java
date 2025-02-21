package com.Lamda;

import java.util.ArrayList;

class Student {
    String name;
    int roll;

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    @Override
    public String toString() {
        String s = name + " " + roll;
        return s;
    }
}

public class Sort {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Alice", 22));
        students.add(new Student("Bob", 20));
        students.add(new Student("Charlie", 21));
        students.add(new Student("David", 20));

        System.out.println("Sorted by roll");
        students.sort((s1,s2)-> Integer.compare(s1.roll, s2.roll));
        System.out.println(students);

        System.out.println("Sort by name");
        students.sort((s1,s2)-> s1.name.compareTo(s2.name));
        System.out.println(students);
    }

}
