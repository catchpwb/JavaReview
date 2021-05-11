package Chapter2;

import java.util.Scanner;

public class Eight {

    public static void main(String[] args) {
        final String currency = "GBP";
        final double exchangeRate = 1.16;

        Scanner keyboard = new Scanner(System.in, "UTF-8");

        System.out.println("Invoice Preparation for IT ConsultPro Inc.");
        System.out.printf("Your National Currency is %s%n", currency);

        System.out.println("Enter the client name [string]: ");
        String name = keyboard.nextLine();
        System.out.println("Enter the regular working hours [decimal number]: ");
        double hours = keyboard.nextDouble();
        System.out.println("Enter the hourly rate [decimal number]: ");
        double rate = keyboard.nextDouble();
        System.out.println("Enter the number of hours worked overtime [decimal number]: ");
        double overtime = keyboard.nextDouble();
        System.out.println("Enter the percentage increase in hourly rate [decimal number]: ");
        double increaseRate = keyboard.nextDouble();

        System.out.printf("IT ConsultPro Inc. - Invoice for %s%n%n", name);
        System.out.printf("%s", "Regular working hours: ");
        System.out.printf("%.0f hours at %.0f %s: ", hours, rate, currency);
        System.out.printf("%.0f %s %n", hours * rate, currency);

        System.out.printf("%s", "Overtime work:");
        System.out.printf("%.0f hours at %.0f %s: ", overtime, increaseRate, currency);
        System.out.printf("%.0f %s %n", overtime * increaseRate, currency);

        System.out.println("--------------------------------------------------");
        System.out.printf("%35s %.2f %s%n", "Total : ", (hours * rate) + (overtime + increaseRate), currency);
        System.out.printf("%43.2f Euro", exchangeRate * ((hours * rate) + (overtime + increaseRate)));
    }
}
