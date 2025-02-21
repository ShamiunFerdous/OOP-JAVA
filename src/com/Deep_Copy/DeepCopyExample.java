package com.Deep_Copy;

class Address implements Cloneable {
    String city;

    public Address(String city) {
        this.city = city;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Address(this.city);  // Creating a new Address object
    }
}

class Student implements Cloneable {
    String name;
    Address address; // Reference type

    public Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student cloned = (Student) super.clone();  // Shallow copy
        cloned.address = (Address) address.clone();  // Deep copy of Address
        return cloned;
    }
}

public class DeepCopyExample {
    public static void main(String[] args) {
        try {
            Address addr = new Address("Dhaka");
            Student s1 = new Student("Shamiun", addr);

            Student s2 = (Student) s1.clone(); // Deep copy

            // Modifying s2's address will NOT affect s1
            s2.address.city = "Chittagong";

            System.out.println("s1 Address: " + s1.address.city); // ✅ Remains "Dhaka"
            System.out.println("s2 Address: " + s2.address.city); // ✅ Changes to "Chittagong"

        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported!");
        }
    }
}
