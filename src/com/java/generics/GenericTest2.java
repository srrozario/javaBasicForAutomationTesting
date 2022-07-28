package com.java.generics;

/* In this class and GenericMainClass2 class generic method will be demonstrated.
Similar to the generics class, we can also create a method that can be used with any type of data.
Such a class is known as Generics Method.
 */

// create a generics class
public class GenericTest2 {
    // create a generics method
    public <T> void genericsMethod(T data) {
        System.out.println("Generics Method:");
        System.out.println("Data Passed: " + data);
    }
}
