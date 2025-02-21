package com.Generics;

import java.util.Arrays;
import java.util.Scanner;

public class WildCard<T extends Number> {

    private Object[] array;
    private int size = 0;
    private static final int DEFAULT_SIZE = 3;

    // Constructor to initialize the array with default size
    WildCard() {
        this.array = new Object[DEFAULT_SIZE];
    }

    public void add(T element) {
        if (isFull()) {
            resize();
        }
        array[size++] = element;
    }

    public boolean isFull() {
        return size == array.length;
    }

    public void resize(){
        Object[] temp = new Object[2*array.length];

        for(int i = 0; i < size; i++){
            temp[i] = array[i];
        }
        array = temp;
    }


    public T remove() {
        if (size == 0) {
            throw new IndexOutOfBoundsException("List is empty");
        }
        T removedElement = (T) array[--size];
        array[size] = null; // Avoid memory leak
        return removedElement;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return (T) array[index];
    }


    public int size() {
        return size;
    }

    public void set(T element, int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        array[index] = element;
    }


    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(array, size));
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WildCard<Integer> arrayList = new WildCard<>();

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 8; i++) {
            int a = sc.nextInt();
            arrayList.add(a);
        }

        System.out.println("ArrayList contents: " + arrayList);
    }
}
