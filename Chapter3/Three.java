package Chapter3;

import java.util.Scanner;

public class Three {

    public static void main(String[] args) {

        System.out.println("This program tells the user which quadrant of the x-y plane " +
                "a point is in.");

        Scanner keyboard = new Scanner(System.in, "UTF-8");
        System.out.println("Please enter the x-coordinate: ");
        double xCoordinate = keyboard.nextInt();
        System.out.println("Please enter the y-coordinate: ");
        double yCoordinate = keyboard.nextInt();

        if (xCoordinate > 0 && yCoordinate > 0) {
            System.out.printf("The point (x = %f, y = %f) is located in the upper right quadrant",
                    xCoordinate, yCoordinate);
        } else if (xCoordinate < 0 && yCoordinate > 0) {
            System.out.printf("The point (x = %f, y = %f) is located in the upper left quadrant",
                    xCoordinate, yCoordinate);
        } else if (xCoordinate < 0 && yCoordinate < 0) {
            System.out.printf("The point (x = %f, y = %f) is located in the lower left quadrant",
                    xCoordinate, yCoordinate);
        } else if (xCoordinate > 0 && yCoordinate < 0) {
            System.out.printf("The point (x = %f, y = %f) is located in the lower right quadrant",
                    xCoordinate, yCoordinate);
        }
    }
}
