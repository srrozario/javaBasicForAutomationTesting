package com.java.oop.encapsulation;

/* In this class encapsulation will be demonstrated
Encapsulation simply means binding object state(fields) and behaviour(methods) together. for example,
a capsule which is mixed of several medicines.
We can create a fully encapsulated class in Java by making all the data members (variables) of the class private.
 */

public class Employee {
    //private data member
    private int employeeId;
    private String employeeName;
    private String employeeDesignation;

    //getter method
    public int getEmpId() {
        return employeeId;
    }

    //getter method
    public String getEmpName() {
        return employeeName;
    }

    //getter method
    public String getEmpDesignation() {
        return employeeDesignation;
    }

    //setter method
    public void setEmpId(int id) {
        employeeId = id;
    }

    //setter method
    public void setEmpName(String name) {
        employeeName = name;
    }

    //setter method
    public void setEmployeeDesignation(String designation) {
        employeeDesignation = designation;
    }
}
