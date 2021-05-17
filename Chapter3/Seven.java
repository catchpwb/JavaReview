/*
Write a program that assigns grade from A-F based on the points earned in an exam
 */
package Chapter3;

import java.util.Scanner;

public class Seven {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in, "UTF-8");

        System.out.println("Student ID [integer]: ");
        int iD = keyboard.nextInt();
        System.out.println("Enter the number of points [decimal]");
        double grade = keyboard.nextDouble();

        //Assert that the inputted values are valid
        //Must be run with the flag -ea from command line
        assert iD >= 0 : "The student ID must be greater than or equal to 0";
        assert (grade >= 0) && (grade <= 100) : "Invalid input for the number of points in the exam."
                + "Allowed values range from 0.0 to 100.0";

        String letterGrade = "";

        if (grade <= 100 && grade >= 91) {
            letterGrade = "A";
        } else if (grade <= 90 && grade >= 81) {
            letterGrade = "B";
        } else if (grade <= 80 && grade >= 61) {
            letterGrade = "C";
        } else if (grade <= 60 && grade >= 31) {
            letterGrade = "D";
        } else if (grade <= 30 && grade >= 15) {
            letterGrade = "E";
        } else if (grade > 15) {
            letterGrade = "F";
        }

        System.out.printf("The student with ID %d gets grade %s", iD, letterGrade);
    }
}
