package com.Static.Variable;

/* Here we are gonna learn about static and non-static variable.
We can not call a non-static method or function inside a static method or a function.
Something that is not static belongs to an object or instance. So, it is always
required to have an object or instance to call it in a static method. Otherwise, it will show error.
 */

public class Var {
    public static void main(String[] args) {

        // if we write greet(), it will give error.

        fun(); // we can call it without any object. As it is a static method.

        Var obj = new Var();
        obj.greet();
    }

    // create a static method. it's not dependent on object.
    static void fun() {

        System.out.println("Life is beautiful !");
        Var obj = new Var();
        obj.greet();
    }

    // here it's a non-static function. we need an object to call it inside the static method
    void greet(){
        System.out.println("Hello");
    }
}
