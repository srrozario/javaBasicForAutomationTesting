package com.java.generics;

public class GenericMainClass {
    //main method
    public static void main(String[] args) {
        // initialize generic class with String data
        GenericTest<String> myObj = new GenericTest<>("Sajib");
        System.out.println(myObj.getObject());

        // initialize generic class with Integer data
        GenericTest<Integer> myObjTest = new GenericTest<>(34);
        System.out.println(myObjTest.getObject());

        // initialize generic class with Float data
        GenericTest<Float> myObjTest2 = new GenericTest<>(5.5f);
        System.out.println(myObjTest2.getObject());

    }
}
