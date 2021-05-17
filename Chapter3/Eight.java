/*
This program calculates the volume of a cube, cylinder, or a sphere
 */
package Chapter3;

import java.util.Scanner;

public class Eight {

    public static void main(String[] args) {

        System.out.println("This program calculates the volume of a cube, cylinder, " +
                "or a sphere.");

        System.out.println("Please enter 0 for cube, 1 for cylinder, or 2 for sphere: ");
        Scanner keyboard = new Scanner(System.in, "UTF-8");
        int solidType = keyboard.nextInt();

        double volume = 0;
        final double PI = 3.14159;

        if (solidType == 0) {
            System.out.println("Please enter the length of each side of the cube [double]: ");
            double length = keyboard.nextDouble();
            //We need the second call because nextDouble leaves an end of line
            //character which gets consumed by the first nextLine call
            keyboard.nextLine();
            System.out.println("Please enter the units of the length [text]: ");
            String units = keyboard.nextLine();

            //Voluem of a cube
            volume = length * length * length;

            System.out.printf("The volume of the cube is %.1f cubic %s %n", volume, units);

        } else if (solidType == 1) {
            System.out.println("Please enter the radius of the cylinder [double]: ");
            double radius = keyboard.nextDouble();
            System.out.println("Please enter the height of the cylinder [double]: ");
            double height = keyboard.nextDouble();
            keyboard.nextLine();
            System.out.println("Please enter the units of the length and height [text]: ");
            String units = keyboard.nextLine();

            //Volume of a cylinder
            volume = PI * height * radius * radius;

            System.out.printf("The volume of the cylinder is %.1f cubic %s %n", volume, units);

        } else if (solidType == 2) {
            System.out.println("Please enter the radius of the sphere [double]: ");
            double radius = keyboard.nextDouble();
            keyboard.nextLine();
            System.out.println("Please enter the units of the  [text]: ");
            String units = keyboard.nextLine();

            //Volume of a sphere
            volume = (4 / 3.0) * PI * radius * radius * radius;

            System.out.printf("The volume of the sphere is %.1f cubic %s %n", volume, units);

        }

    }
}
