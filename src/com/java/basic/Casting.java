package com.java.basic;

/* In this class, different types of casting will be demonstrated
 */

/* In Java, there are two types of casting:
Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double
Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte
 */

public class Casting {
    public static void main(String[] args) {
        //the below variables are used for Widening casting
        int num1 = 9;
        double doubleNum1 = num1; //automatic casting int to double
        //printing the casting value num1 variable
        System.out.println("Widening casting value of num1 variable is " + doubleNum1);

        //the below variables are used for Narrow casting
        double doubleNum2 = 8.75;
        int num2 = (int) doubleNum2; //manual casting double to int
        //printing the casting value doubleNum2 variable
        System.out.println("Narrow casting value of doubleNum2 variable is " + num2);
    }
}
