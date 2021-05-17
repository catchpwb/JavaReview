/*
Write a program that calculates how much the amount deposited in a bank account has grown
at the annual interest rate of r after n years
 */
package Chapter3;

import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {

        //Gather information needed from user
        System.out.println("Calculation of Compound Interest:");
        Scanner keyboard = new Scanner(System.in, "UTF-8");
        System.out.println("Enter the initial amount deposited [decimal value]: ");
        double initialDeposited = keyboard.nextDouble();
        System.out.println("Enter the interest rate [decimal value]: ");
        double interestRate = keyboard.nextDouble();
        System.out.println("Enter the number of years [integer]: ");
        int numberOfYears = keyboard.nextInt();
        System.out.println("Enter the currency used [string]: ");
        keyboard.nextLine();
        String currency = keyboard.nextLine();

        //Assertions to validate inputted data
        assert initialDeposited >= 0 : "Initial amount deposited must be a positive number";
        assert interestRate >= 0 : "Interest rate must be a positive number";
        assert numberOfYears >= 0 : "The number of years must be a positive number";
        assert !currency.equals("") : "The currency must be a non-empty string";

        //Calculate amount
        double temp1 = 1 + interestRate / 100.0;
        double temp2 = Math.pow(temp1, numberOfYears);
        double totalAmount = initialDeposited * temp2;

        //Assertions to validate calculated data
        assert totalAmount >= initialDeposited : "The total amount after interest must be " +
                "greater than or equal to the initial amount deposited";

        System.out.printf("Amount with interest after %d years: %.2f %s %n", numberOfYears,
                totalAmount, currency);
    }
}
