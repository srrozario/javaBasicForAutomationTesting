package com.java.oop.inheritance;

/* In this class and InheritanceSubClass class inheritance will be demonstrated.
The class whose features are inherited is known as superclass(or a base class or a parent class)
*/

public class InheritanceSuperClass {
    //static/class variable
    int gear = 5;
    //static/class variable
    int speed = 120;

    // toString() method to print gear and speed variable value
    public String toString() {
        return ("Total number of gear is " + gear + "\n" + "Max speed is " + speed);
    }

}


