package com.java.oop.abstracts;

public class BracBank extends Bank {
    @Override
    int getRateOfInterest() {
        return 7;
    }
    //creating a non-abstract method
    public double getAmountWithInterest(int amount, int day){
        return amount * day * 0.07;
    }
}
