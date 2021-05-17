/*
Write a program that calculates how much the amount deposited in a bank account has grown
for an interval of interest rates over n years
 */
package Chapter3;

import java.util.Scanner;

public class Eleven {
    public static void main(String[] args) {

        //Gather information needed from user
        System.out.println("Calculation of deposits with interest for min to max rates: ");
        Scanner keyboard = new Scanner(System.in, "UTF-8");
        System.out.println("Enter the initial amount deposited [decimal value]: ");
        double initialDeposited = keyboard.nextDouble();
        System.out.println("Enter the minimum interest rate [decimal value]: ");
        double minInterestRate = keyboard.nextDouble();
        System.out.println("Enter the maximum interest rate [decimal value]: ");
        double maxInterestRate = keyboard.nextDouble();
        System.out.println("Enter the number of years [integer]: ");
        int numberOfYears = keyboard.nextInt();
        System.out.println("Enter the currency used [string]: ");
        keyboard.nextLine();
        String currency = keyboard.nextLine();

        //Assertions to validate inputted data
        assert initialDeposited >= 0 : "Initial amount deposited must be a positive number";
        assert minInterestRate >= 0 : "Interest rate must be a positive number";
        assert (maxInterestRate >= 0) && (maxInterestRate >= minInterestRate) : "Interest rate must be a positive number";
        assert numberOfYears >= 0 : "The number of years must be a positive number";
        assert !currency.equals("") : "The currency must be a non-empty string";

        System.out.println("Amounts will be printed with 0.5% increment in interest rate");

        double interestStepSize = 0.5;
        double currentInterest = minInterestRate;
        do {
            //Calculate amount
            double temp1 = 1 + currentInterest / 100.0;
            double temp2 = Math.pow(temp1, numberOfYears);
            double totalAmount = initialDeposited * temp2;

            //Assertions to validate calculated data
            assert totalAmount >= initialDeposited : "The total amount after interest must be " +
                    "greater than or equal to the initial amount deposited";

            System.out.printf("Amount with interest after %d years with interest rate %.2f%: " +
                    "%.2f %s %n", numberOfYears, currentInterest, totalAmount, currency);

            //Increase current interest rate by 0.5
            currentInterest += interestStepSize;
        } while (currentInterest <= maxInterestRate);

    }
}
