package Chapter2;

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in, "UTF-8");

        System.out.printf("Salesman's Salary Calculation %n%n");
        System.out.printf("Enter units sold of Product A [integer]: ");
        int a = keyboard.nextInt();
        System.out.printf("Enter units sold of Product B [integer]: ");
        int b = keyboard.nextInt();
        System.out.printf("Enter units sold of Product C [integer]: ");
        int c = keyboard.nextInt();
        System.out.printf("Enter units sold of Product D [integer]: ");
        int d = keyboard.nextInt();
        System.out.printf("Enter provision rate in percent [decimal value]: ");
        double rate = keyboard.nextDouble();

        System.out.printf("%nSalary Slip %n%n");
        final double priceA = 239.99, priceB = 129.75, priceC = 99.95, priceD = 350.89;

        System.out.printf("Product A:");
        System.out.printf(" %-3d units x %8.2f GBP = %8.2f GBP %n", a, priceA, a * priceA);
        System.out.printf("Product B:");
        System.out.printf(" %-3d units x %8.2f GBP = %8.2f GBP %n", b, priceB, b * priceB);
        System.out.printf("Product C:");
        System.out.printf(" %-3d units x %8.2f GBP = %8.2f GBP %n", c, priceC, c * priceC);
        System.out.printf("Product D:");
        System.out.printf(" %-3d units x %8.2f GBP = %8.2f GBP %n", d, priceD, d * priceD);
        System.out.printf("%10s", "                                    --------------");
    }
}
