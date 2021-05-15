/*Write a program that determines whether a user supplied number is inside or outside
an interval
 */
package Chapter3;

import java.util.Scanner;

public class Two {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in, "UTF-8");
        System.out.println("Please enter the interval beginning with the lower bound, " +
                "followed by the upper limit [integer integer]: ");
        int lowerBound = keyboard.nextInt();
        int upperBound = keyboard.nextInt();
        System.out.println("PLease enter the value to be considered [integer]: ");
        int value = keyboard.nextInt();

        if (value < lowerBound || value > upperBound) {
            System.out.printf("The value %d lies outside the interval [%d, %d] %n", value,
                    lowerBound, upperBound);
        } else {
            System.out.printf("The value %d lies inside the interval [%d, %d] %n", value,
                    lowerBound, upperBound);
        }
    }
}
