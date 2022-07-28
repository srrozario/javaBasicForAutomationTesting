package com.java.oop.interfaces;

/*  Here interface will be demonstrated.
An interface in Java is a blueprint of a class. It has static constants and abstract methods.
interfaces can have abstract methods and variables. It cannot have a method body.it cannot be instantiated
just like the abstract class. Since Java 8, we can have default and static methods in an interface. Since Java 9,
we can have private methods in an interface.
*/

public interface Salary {
    //abstract method
    int getYearlySalaryIncrementRate();

    //default method
    default double getAmount(int monthlyAmount, int month) {
        return monthlyAmount * month;
    }
}
