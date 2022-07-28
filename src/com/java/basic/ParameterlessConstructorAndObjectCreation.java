package com.java.basic;

/* In this class parameterless constructor and object creation will be demonstrated
 */

public class ParameterlessConstructorAndObjectCreation {
    //create class attribute
    String name;
    int age;
    int distance;
    int num;

    //create a parameterless class constructor
    public ParameterlessConstructorAndObjectCreation() {
        this.name = "Sajib";
        this.age = 28;
        this.distance = 2;
        this.num= 3;
    }

    //main method
    public static void main(String[] args) {
        //create an object called myObj
        ParameterlessConstructorAndObjectCreation myObj = new ParameterlessConstructorAndObjectCreation();
        //printing the value of num variable
        System.out.println("the value of num variable is " +myObj.num);

        // create an object called testSR and this will call the parameterless constructor
        ParameterlessConstructorAndObjectCreation testSR = new ParameterlessConstructorAndObjectCreation();
        //printing the value of parameterless constructor
        System.out.println(testSR.name+ " "+"walks"+" "+testSR.distance+"km");
    }
}
