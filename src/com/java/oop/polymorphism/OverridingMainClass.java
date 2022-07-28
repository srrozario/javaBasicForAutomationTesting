package com.java.oop.polymorphism;

/* In this class and OverridingSubClass class overriding will be demonstrated.
If a subclass provides the specific implementation of the method that has been declared by one of its parent class,
it is known as method overriding.
*/

public class OverridingMainClass {
    //creating a method
    public int bikeLimit() {
        return 80;
    }

    //creating a method
    void mainClassMethod() {
        //printing a statement
        System.out.println("print from main class");
    }
}
