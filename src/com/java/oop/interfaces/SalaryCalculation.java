package com.java.oop.interfaces;

public class SalaryCalculation implements Salary {

    @Override
    public int getYearlySalaryIncrementRate() {
        return 7;
    }

    //main method
    public static void main(String args[]) {
        //creating an object
        Salary IT = new SalaryCalculation();
        //printing salary amount
        System.out.println("Salary amount is " + IT.getAmount(400065, 12));
        //printing salary increment rate
        System.out.println("Yearly salary increment rate is " + IT.getYearlySalaryIncrementRate());
    }
}
