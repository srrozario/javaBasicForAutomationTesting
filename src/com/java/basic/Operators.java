package com.java.basic;

/* In this class, the following operators
 ++, --, =, +=, -=, /=, *= and primitive data type will be demonstrated
 */

public class Operators {

    public static void main(String[] args) {
        int age = 25; //this variable is used for ++ operator
        double amount = 200.25; //this variable is used for -- operator
        char grade = 'A'; //this variable is used for = operator
        int score = 35; //this varqaible is used for += & -= operator
        double totalSalary = 80000.55; //this variable is used for /= operator
        int num = 20;  //this variable is used for *= operator

        //1. using ++ operator
        //printing the value of age using post-increment operator
        System.out.println("My age is " + age++);
        //variable is incremented AFTER it has been evaluated for use in the above expression
        System.out.println("My age is " + age);

        //printing the value of age using pre-increment operator
        //variable is incremented BEFORE it has been evaluated for use in the  below expression
        System.out.println("My age is " + ++age);

        //alternative way to using pre-increment operator
        age++;
        System.out.println("My age is " + age);

        //2. using -- operator
        //Printing the value of amount as using `post-decrement operator
        System.out.println("Final collection amount is " + amount--);
        //variable is decremented AFTER it has been evaluated for use in the above expression
        System.out.println("Final collection amount is " + amount);

        //Printing the value of amount as using `pre-decrement operator
        //variable is decremented BEFORE it has been evaluated for use in the below expression
        System.out.println("Final collection amount is " + --amount);

        //Another way of using -- operator
        amount--;
        System.out.println("Final collection amount is " + amount);

        //3. using = operator
        System.out.println("Your grade is " + grade);

        //4. using += operator
        // adding left operand with right operand and then assigning it to the variable on the left
        score += 5;
        System.out.println("Score is " + score);

        //5. using -= operator
        //subtracting right operand from left operand and then assigning it to the variable on the left
        score -= 10;
        System.out.println("Downgraded score is " + score);

        //6. using /= operator
        //dividing left operand by right operand and then assigning it to the variable on the left
        totalSalary /= 10;
        System.out.println("Average salary is " + totalSalary);

        //7. using *= operator
        //multiplying left operand with right operand and then assigning it to the variable on the left
        num *= 10;
        System.out.println("Muliplication value of num is " + num);

    }

}
