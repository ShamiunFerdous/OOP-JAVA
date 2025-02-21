package com.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(3);
        Box b3 = new Box(4,5,6);

        BoxW b5 = new BoxW(b3);
        b5.prnt();

        Box b7 =  new BoxW(2,4,6,7);
        b7.print();
        /* b7.prnt(); it will show error, because there are no property named
        weight in the Box class.
         */



        BoxW b4 = new BoxW(6, 7 , 8,9);
        b4.print();
        /* as we inherit Box into BoxW , the objects of BoxW class have the
        access to use the function in the Box class.
         */
        b4.prnt();

        /*
        When you create an object using the parent class, only the parent class
        constructor runs. This means the child class variables aren’t set up because
        the child constructor isn’t called. If you try to access those child
        variables, it causes an error since they’re not initialized.
         */

    }
}