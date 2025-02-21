/*Inherit Box class into BoxW class by extends keyword. By this now we can use all the
variables , constructor , method , function of the Box class in the BoxW class. In other
word BoxW has the access to all the properties of the Box class. But the Box class doesn't
have the access to the extra properties of the BoxW. i.e.We can use weight variable for the
objects of the BoxW class only.
 */
package com.Inheritance;
public class BoxW extends Box{
    double weight = 1;

    //this will indicate the constructor where we pass an object of Box type
    BoxW (Box other){
        super(other);

    }


    BoxW(double l, double w, double h, double weight){
        super(l,w,h);
        this.weight = weight;

        /* by this Super keyword we got the access of the constructor in the
        box class in which we pass three parameters. if we don't use super in here,
        the default values that we set in the parent class will print.
         */
    }

    void prnt(){
        System.out.println(this.l+" "+this.w+ " "+this.h + " "+this.weight);
    }
}
