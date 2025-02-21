package com.Exception;
import java.util.Scanner;

class myexception extends Exception{
    public myexception(String message){
        super(message);
    }
}

public class CustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int a;
            int b;
            a = sc.nextInt();
            b = sc.nextInt();
            int c =divide(a,b);

            System.out.println(c);

        } catch (myexception e) {
            System.out.println("execption found"+e);
        }
        finally{
            sc.close();
        }
    }

    public static int divide(int a, int b) throws myexception{
        if(b == 0){
            throw new myexception("The divide operation failed");
        }
        return a / b;
    }
}
