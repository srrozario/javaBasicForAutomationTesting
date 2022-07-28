package com.java.oop.polymorphism;

/* In this class overloading will be demonstrated
If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.
*/

public class Overloading {
    //creating a method with two parameter and a return type
    int add(int num1, int num2) {
        return num1 + num2;
    }

    //creating same method with different parameter and return type
    int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    //creating same method with no parameter but different return type
    int add() {
        return 5 + 8;
    }

    //creating main method
    public static void main(String[] args) {
        //creating an object to access the method which are inside the class
        Overloading myObj = new Overloading();
        //printing first method
        System.out.println("Sum of 2 numer is " + myObj.add(22, 23));
        //printing second method
        System.out.println("Sum of 3 numer is " + myObj.add(10, 13, 25));
        //printing third method
        System.out.println(myObj.add());
    }
}
