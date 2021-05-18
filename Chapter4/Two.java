/*
Write a program that asks for relevant information to print a horoscope.
Review terminology of OOP in java
 */
package Chapter4;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {

        //Reference variable declaration
        //Declare REFERENCE VARIABLE keyboard of REFERENCE TYPE Scanner
        //The following declaration results in memory being allocated for the reference
        //keyboard, that can store the reference value of a Scanner object
        Scanner keyboard;
        //Creation of object of the class Scanner
        //The operator new creates an object of class Scanner whose name is specified in the
        // constructor call, and returns the reference value of the new object
        keyboard = new Scanner(System.in, "UTF-8");

        System.out.println("What is your name?");
        String name = keyboard.nextLine();
        System.out.println("Who is your manager?");
        String manager = keyboard.nextLine();
        System.out.println("What department do you work in?");
        String job = keyboard.nextLine();
        System.out.println("What department do you like the least?");
        String departmentName = keyboard.nextLine();
        System.out.println("How large of a raise do you expect per year?");
        String percent = keyboard.nextLine();
        System.out.println("What is a bonus that you would not expect?");
        String surprise = keyboard.nextLine();

        System.out.printf("Expect bad news, %s. %n", name);
        System.out.printf("Your manager, %s, is not happy with %s, %n", manager, job);
        System.out.printf("and is planning to move you to the %s department. %n", departmentName);
        System.out.printf("Your salary will be reduced by %s%% . %n", percent);
        System.out.printf("But your manger also has a surprise coming: %s. %n", surprise);
    }
}
