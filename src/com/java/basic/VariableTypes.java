package com.java.basic;

/* In this class different types of variable will be demonstrated, please check the links to`understand difference
between local variable instance variable and class variable
http://www.fredosaurus.com/notes-java/data/variables/45local-inst-class.html
 */

public class VariableTypes {
    //static/class variable
    static String name = "Sajib";

    //instance variables
    public int age = 23;
    protected String gender = "Male";
    private int salary = 40000;

    public VariableTypes() {
        //local variable
        double num = 3.3;
        //printing local variable value which is declared in a constructor
        System.out.println("The value of num is " + num);
    }

    public static void main(String[] args) {
        //local variable
        int id = 4;
        //creating an object to access instance variable
        VariableTypes myObj = new VariableTypes();
        //printing instance variable value
        System.out.println("My age is " + myObj.age);
        //printing class variable value
        System.out.println("My name is " + name);
        //printing local variable value which is declared in the main method
        System.out.println("My id is " + id);

    }
}



