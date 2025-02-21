package com.Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Checked {

    // Checked exception - FileNotFoundException
    public void readFile1(String fileName) {
        try {
            FileReader file1 = new FileReader(fileName);
            System.out.println("File found and opened.");
        } catch (FileNotFoundException e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        }
    }

    // Checked exception
    public void readFile2(String fileName) throws Exception {
        FileReader file2 = new FileReader(fileName);
        System.out.println("File found and opened.");
    }

    public static void main(String[] args) {
        Checked c = new Checked();
        c.readFile1("nonexistentfile.txt");

        try{
            c.readFile2("nonexistentfile.txt");
        } catch (Exception e) {
            System.out.println("Caught checked exception: " + e);
        }
        // By finally keyword , we print whatever we want. It will execute either there is an execption or not.
        finally {
            System.out.println("This will always execute");
        }
    }
}
