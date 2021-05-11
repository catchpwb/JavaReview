package Chapter2;

import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {

        System.out.println("Calculation of deposits with interest %n%n");


        Scanner keyboard = new Scanner(System.in, "UTF-8");

        System.out.println("Enter the initial amount deposited [decimal value]: ");
        double initial = keyboard.nextDouble();
        System.out.println("Enter the interest rate [decimal value]: ");
        double interestRate = keyboard.nextDouble();
        //We need this nextLIne call in order to get the desired output.
        //The reason for this is that nextInt does not consume the end of line character \n,
        //so a call to nextLine consumes that first then continues onto the next block of code
        keyboard.nextLine();
        System.out.println("Enter the currency used [string]: ");
        String currency = keyboard.nextLine();

        double intermediate = 1 + interestRate / 100;
        double amountOne = initial * intermediate;
        double amountTwo = amountOne * intermediate;
        double amountThree = amountTwo * intermediate;

        System.out.printf(" Amount with interest after 1 year: %.2f %s %n", amountOne, currency);
        System.out.printf(" Amount with interest after 2 year: %.2f %s %n", amountTwo, currency);
        System.out.printf(" Amount with interest after 3 year: %.2f %s %n", amountThree, currency);

    }
}
