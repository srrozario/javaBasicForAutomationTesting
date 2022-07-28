package com.java.basic;

/* In this class, different types of if....else statements will be demonstrated
 */

public class IfElseStatements {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 14;
        int num3 = 20;

        // if statement
        if (num1 < num2) {
            //printing if condition values
            System.out.println("num2 is grater than num1 and the value of num2 is " + num2);
        }

        //if..else statement
        if (num2 > num3) {
            //printing if condition values
            System.out.println("num2 is greater than num3 and the value of num3 is " + num2);
        } else {
            //printing else condition values
            System.out.println("num3 is greater than num2 and the value of num3 is " + num2);
        }

        // else..if statement
        if (num1 > num2) {
            // printing if condition value
            System.out.println("num1 is greater than num2 and the value of num1 is " + num1);
        } else if (num3 > num2) {
            // printing else if condition value
            System.out.println("num3 is greater than num2 and the value of num3 is " + num3);
        } else {
            // printing else condition value
            System.out.println("num2 is greater than num1 and the value of num2 is " + num2);
        }
    }
}

