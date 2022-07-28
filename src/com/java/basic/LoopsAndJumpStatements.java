package com.java.basic;

/* In this class, different types of loops and jump statements will be demonstrated
 */

public class LoopsAndJumpStatements {
    public static void main(String[] args) {
        int i = 2; //this variable will be used in while loop
        String[] subject = {"Math", "Chemistry", "Physics"}; //this variable will be used in for each loop

        //1. while loop
        while (i < 5) {
            //printing while loop condition value
            System.out.println("the values of i in while loop is " + i);
            i++;
        }

        //2. for loop
        for (int j = 10; j >= 5; j--) {
            //printing for loop condition value
            System.out.println("the value of j in for loop is " + j);
        }

        //3. for each loop
        for (String test : subject) {
            //printing for each loop value
            System.out.println("Subject: " + test);
        }

        //4. jump statement
        /* There are two Jump statements that are provided in the Java programming language:
        (i) Break statement
        (ii) Continue statement
         */

        //4a. break statement in for loop
        for (int k = 0; k <= 10; k++) {
            if (k == 5) {
                break; //this will exit from for loop
            }
            // printing break statement condition values
            System.out.println("printing value of k in break statement " + k);
        }

        //4b. continue statement in for loop
        for (int l = 10; l >= 5; l--) {
            if (l == 6) {
                continue; //this will skip variable value = 6 from for loop
            }
            // printing continue statement condition values
            System.out.println("printing value of l in continue statement " + l);
        }

        //break statement in while loop
        int m = 9;
        while (m > 4) {
            if (m == 5) {
                break;//this will exit from for loop
            }
            // printing break statement condition values
            System.out.println("printing value of m in break statement while loop " + m);
            m--;
        }

        //continue statement in while loop
        int num4 = 1;
        while (num4 < 6) {
            if (num4 == 2) {
                num4++;
                continue; //this will skip variable value = 2 from for loop
            }
            // printing continue statement condition values
            System.out.println("printing value of num4 in continue statement while loop " + num4);
            num4++;
        }
    }
}

