import java.util.Scanner;

public class Five {

    /*
    Calculates the area a and circumference c of a circle
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in, "UTF-8");

        System.out.println("Please enter the radius of the circle: ");
        int r = keyboard.nextInt();
        //Specify the value of pi to be unchanging
        final double p = 3.1415927;
        System.out.printf("The area of the cirle is: %f%n", p * r * r);
        System.out.printf("The circumference of the circle is: %f%n", 2 * p * r);


    }
}
