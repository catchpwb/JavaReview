/*
Write a program that reads a sequence of positive integers from the keyboard and prints
their average. Use a negative integer as a sentinel value
 */

package Chapter3;

import java.util.Scanner;

public class Five {

    public static void main(String[] args) {

        System.out.println("Please enter a series of positive integers or -1 to quit: ");

        //Initialize variables, and sentinel value to monitor the while loop
        final int SENTINEL = -1;
        int count = 0;
        int sum = 0;

        Scanner keyboard = new Scanner(System.in, "UTF-8");
        int next = keyboard.nextInt();

        //Sums the inputted integers and keeps track of how many integers are added
        while (next != SENTINEL) {
            sum += next;
            count++;
            next = keyboard.nextInt();
        }

        //Casts the variables so that we get double division instead of integer division
        double average = sum / (double) count;
        System.out.printf("The average of the positive integers is: %f%n", average);

    }
}
