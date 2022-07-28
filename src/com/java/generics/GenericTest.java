package com.java.generics;

/* In this class and GenericMainClass class generics class will be demonstrated.
A class that can refer to any type is known as a generic class.
 */

// create a generics class
public class GenericTest<T> {
    //object type of T is declared
    public T obj;

    //creating a constructor
    GenericTest(T obj) {
        this.obj = obj;
    }

    //method that return T type variable
    public T getObject() {
        return this.obj;
    }
}
