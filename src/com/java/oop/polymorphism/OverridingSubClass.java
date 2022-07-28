package com.java.oop.polymorphism;

public class OverridingSubClass extends OverridingMainClass {
    // This method overrides show() of Parent
    @Override
    public int bikeLimit() {
        return 100;
    }

    @Override
    void mainClassMethod() {
        //printing a statement
        System.out.println("print from subclass");
    }

    public static void main(String[] args) {
        //creating an object
        OverridingMainClass maxLimit = new OverridingSubClass();
        int num = maxLimit.bikeLimit();
        // printing bikeLimit() method value of this class
        System.out.println("bike speed limit is " + num);
        /* creating an object
        If a Parent type reference refers
        to a Child object, then Child's
        show is called. This is known as RUN TIME POLYMORPHISM */
        OverridingMainClass myObj = new OverridingSubClass();
        myObj.mainClassMethod();
        /* creating an object
        If a Parent type reference refers
        to a Parent object, then Parent's
        class method is called */
        OverridingMainClass myObj1 = new OverridingMainClass();
        myObj1.mainClassMethod();
    }
}

