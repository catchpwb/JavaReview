package Chapter2;

import java.util.Scanner;

public class Nine {

    /*
    Calculates the area a and circumference c of a circle
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in, "UTF-8");

        System.out.println("Please enter the units used to measure the radius: ");
        String units = keyboard.nextLine();
        System.out.println("Please enter the radius of the circle: ");
        double r = keyboard.nextDouble();
        //Specify the value of pi to be unchanging
        final double p = 3.1415927;
        System.out.printf("The area of the cirle is: %f %s %n", p * r * r, units);
        System.out.printf("The circumference of the circle is: %f %s %n", 2 * p * r, units);


    }
}
