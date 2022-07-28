package com.java.oop.abstracts;

public class BankInterestDetails {
    public static void main(String[] args) {
        //creating an object
        BracBank bracBank = new BracBank();
        //printing interest rate of brac bank
        System.out.println("Brac bank interest rate is " + bracBank.getRateOfInterest());
        //printing amount of brac bank
        System.out.println("Brac bank amount is " + bracBank.getAmountWithInterest(5000, 10));

        //creating an object
        CityBank cityBank = new CityBank();
        //printing interest rate of city bank
        System.out.println("City bank interest rate is " + cityBank.getRateOfInterest());

        //creating an object
        SCB scbBank = new SCB();
        //printing interest rate of scb bank
        System.out.println("SCB bank interest rate is " + scbBank.getRateOfInterest());


    }
}
