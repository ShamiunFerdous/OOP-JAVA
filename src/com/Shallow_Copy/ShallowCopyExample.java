package com.Shallow_Copy;


/*
A shallow copy means creating a new object but copying references to the original
object's fields, instead of copying the actual values. If an object has
primitive fields, they get copied normally, but if it has reference fields (objects, arrays, etc.),
only the references are copied—not the actual objects.
 */

class Address {
    String city;

    public Address(String city) {
        this.city = city;
    }
}

class Student implements Cloneable {
    String name;
    Address address;  // Reference type

    public Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Creates a shallow copy
    }
}

public class ShallowCopyExample {
    public static void main(String[] args) {
        try {
            Address addr = new Address("Dhaka");
            Student s1 = new Student("Shamiun", addr);

            Student s2 = (Student) s1.clone(); // This is Shallow copy

            System.out.println("Before modifying address");
            System.out.println("s1 Address: " + s1.address.city);
            System.out.println("s2 Address: " + s2.address.city);

            // Modifying the address of s2 also affects s1 (because reference is shared)
            s2.address.city = "Chittagong";

            System.out.println("After modifying address");
            System.out.println("s1 Address: " + s1.address.city);
            System.out.println("s2 Address: " + s2.address.city);

        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported!");
        }
    }
}
