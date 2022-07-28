package com.java.basic;

/* In this class parameterized constructor will be demonstrated
 */

public class ParameterizedConstructor {
    //create class attribute
    String name;
    int age;

    //create a parameterized class constructor
    public ParameterizedConstructor(String personName, int personAge) {
        this.name = personName;
        this.age = personAge;
    }

    //main method
    public static void main(String[] args) {
        // create an object call myObj and this will call the parameterized constructor
        ParameterizedConstructor myObj = new ParameterizedConstructor("Sajib", 28);
        //printing the value of parameterized constructor
        System.out.println(myObj.name + " " + "is" + " " + myObj.age + " " + "years old");
    }
}
