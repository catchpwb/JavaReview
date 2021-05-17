/*
Write a program that sums n integers
 */
package Chapter3;

import java.util.Scanner;

public class Four {

    public static void main(String[] args) {

        System.out.println("This program sums n integers.");
        System.out.println("Please enter the number of integers to be added [integer]: ");

        Scanner keyboard = new Scanner(System.in, "UTF-8");
        int numOfInt = keyboard.nextInt();

        System.out.printf("Please enter the integers: %n");

        int sum = 0;
        int count = 0;
        do {
            int temp = keyboard.nextInt();
            sum = sum + temp;
            count++;
        } while (count < numOfInt);

        System.out.printf("Sum = %d%n", sum);
    }
}
