package com.java.oop.encapsulation;

public class GetEmployeeDetails {
    public static void main(String[] args) {
        //creating an object
        Employee obj = new Employee();
        //setting value in the employeeId data member
        obj.setEmpId(110234);
        //setting value in the employeeName data member
        obj.setEmpName("Jhon");
        //setting value in the employeeDesignation data member
        obj.setEmployeeDesignation("SQA Engineer");
        //printing value of the employeeId data member
        System.out.println("Employee Id: " +obj.getEmpId());
        //printing value of the employeeName data member
        System.out.println("Employee Name: " +obj.getEmpName());
        //printing value of the employeeDesignation data member
        System.out.println("Employee Designation: " +obj.getEmpDesignation());
    }
}
