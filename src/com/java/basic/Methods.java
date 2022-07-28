package com.java.basic;

/* In this class return type and parameter type method will be demonstrated
 */

public class Methods {
    //parameterless void method
    public static void parameterlessVoidMethod() {
        int age = 20; //this variable will  be used in parameterless method
        //printing value of parameterless void method
        System.out.println("My age is:" + age);
    }

    //parameterless return type method
    static String name = "Sajib";

    public static String getName() {
        return name;
    }

    //parameterized void method
    //passing parameter into void method
    public static void time(int hour, int minute) {
        //printing value of parameterized void method
        System.out.println(hour + ":" + minute);
    }

    //parameterized return type method
    //passing parameter into return type method
    public static int maximumValue(int a, int b) {
        int max; //this variable will store the maximum value
        //simple if...else statement to get the maximum value
        if (a > b)
            max = a;
        else max = b;
        return max;
    }

    //main method
    public static void main(String[] args) {
        //calling parameterless void method into main method
        parameterlessVoidMethod();

        System.out.println("My name is" + " " + getName());
        int hour = 12; //this variable is used in parameterized void method
        int minute = 30;  //this variable is used in parameterized void method
        time(hour, minute);
        int num1 = 4;  //this variable is used in parameterized return type method
        int num2 = 5;  //this variable is used in parameterized return type method
        int num3 = maximumValue(num1, num2); //this variable is used in parameterized return type method
        //printing value of parameterized return type method
        System.out.println("Maximum value :" + num3);
    }
}