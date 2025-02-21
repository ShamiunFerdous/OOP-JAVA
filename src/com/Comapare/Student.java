package com.Comapare;

public class Student implements Comparable<Student>{

    int roll;
    float marks;

    public Student(int roll, float marks) {
        this.roll = roll;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
       int compare = (int)(this.marks - o.marks);
       return compare;
    }
}
