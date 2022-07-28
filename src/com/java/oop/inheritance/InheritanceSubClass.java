package com.java.oop.inheritance;

/* The class that inherits the other class is known as a subclass(or a derived class, extended class, or child class).
The subclass can add its own fields and methods in addition to the superclass fields and methods.
*/

public class InheritanceSubClass extends InheritanceSuperClass {
    //static/class variable
    public int seatHeight = 7;

    // toString() method to print gear and speed variable value
    public String toString() {
        return (super.toString() + "\n" + "Seat height is " + seatHeight);
    }

    //creating main method
    public static void main(String[] args) {
        //creating an object
        InheritanceSubClass myObj = new InheritanceSubClass();
        //calling toString method from InheritanceSubClass class
        System.out.println(myObj.toString());
    }
}