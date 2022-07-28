package com.java.generics;

public class GenericMainClass2 {
    //main method
    public static void main(String[] args) {
        // initialize the class with Integer data
        GenericTest2 myObj = new GenericTest2();

        // generics method working with String
        myObj.<String>genericsMethod("Java Programming");

        // generics method working with integer
        myObj.<Integer>genericsMethod(25);
    }
}

