package Chapter2;

import java.util.Scanner;

public class Two {
    /*
    Converts the temperature in degrees Celsius to Kelvin
    */
    public static void main(String[] args) {
        //Scanner class differs from Java Actually
        //The addition of the "UTF-8" argument ensures the code will work in different
        // programming environments
        Scanner keyboard = new Scanner(System.in, "UTF-8");

        System.out.print("Please enter the temperature in degrees Celsius:");
        double celsius = keyboard.nextDouble();
        System.out.printf("The temperature in Fahrenheit is: %f", (celsius + 273.16));

    }
}
