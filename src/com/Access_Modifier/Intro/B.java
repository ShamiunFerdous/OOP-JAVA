package com.Access_Modifier.Intro;

public class B {
    protected int b = 10;
}
/*
The member is accessible within its own class, subclasses,
 and classes in the same package (in Java).
 So we can't use this 'b' variable in Intro2 package. It will give
 error.
 */