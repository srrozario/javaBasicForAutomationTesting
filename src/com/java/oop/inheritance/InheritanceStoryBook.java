package com.java.oop.inheritance;

public class InheritanceStoryBook extends InheritanceBookType {
    //static/class variable
    String bookName1 = "Story book 1";
    //static/class variable
    String bookName2 = "Story book 2";

    //main method
    public static void main(String[] args) {
        //creating an object
        InheritanceStoryBook myObj = new InheritanceStoryBook();
        //printing variable values from InheritanceBookType class
        System.out.println("Printing book types: " + myObj.bookType1 + "," + myObj.bookType2);
        //printing variable values from InheritanceStoryBook class
        System.out.println("Printing book story book names: " + myObj.bookName1 + "," + myObj.bookName2);
        //calling printBookInfo() method from InheritanceBookType class
        myObj.printBookInfo();

    }
}
