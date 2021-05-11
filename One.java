import java.util.Scanner;

public class One {
    /*
    Converts the temperature from Celsius to Fahrenheit
     */
    public static void main(String[] args) {
        //Scanner class differs from Java Actually.
        //The addition of the "UTF-8" argument ensures the code will work in different
        // programming environments
        Scanner keyboard = new Scanner(System.in, "UTF-8");

        System.out.print("Please enter the temperature in degrees Celsius:");
        double celsius = keyboard.nextDouble();
        System.out.printf("The temperature in Fahrenheit is: %f", ((9.0 * celsius) / 5 + 32));
    }
}
