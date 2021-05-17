/*
Write a program that averages a user inputted sequence of float values,
where the sequence length is specified by the user
 */

package Chapter3;

import java.util.Scanner;

public class Six {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in, "UTF-8");

        System.out.println("This program averages a sequence of float values.");
        System.out.println("Please specify the sequence length [integer]: ");
        double length = keyboard.nextDouble();

        //Initialize variables
        double count = 0;
        double sum = 0;
        double seq = 0;

        //Sums the sequence and counts the
        System.out.println("Please enter the sequence: ");
        while (count < length) {
            System.out.printf("here %f%n", seq);
            seq = keyboard.nextDouble();
            sum += seq;
            count++;
        }

        double average = sum / length;
        System.out.printf("The sum of the values is: %f%n", sum);
        System.out.printf("The average of the values is: %f", average);
    }
}
