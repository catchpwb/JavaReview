package Chapter2;

import java.util.Scanner;

public class Four {
    /*
    Calculates the volume v of a cube with dimensions l, b, and h, all floating point
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in, "UTF-8");

        System.out.println("Enter the length, breadth, and height of the cube [float float float]: ");
        float l = keyboard.nextInt();
        float b = keyboard.nextInt();
        float h = keyboard.nextInt();
        System.out.printf("The volume of the cube is: %f", l * b * h);

    }
}
