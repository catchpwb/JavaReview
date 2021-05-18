/*
Write a program that reads a line of text from the keyboard and prints out an acronym
using the first letter of each word
 */
package Chapter4;

import java.util.Scanner;

public class Three {

    public static void main(String[] args) {

        System.out.println("Please enter a sentence: ");

        //Reference variable declaration
        //Declare reference variable keyboard of reference type scanner
        //keyboard stores the reference value of a scanner object
        Scanner keyboard;
        //Creation of a scanner object
        //New creates an object of class scanner, with name given in the constructor call
        //and returns the reference value of the new object
        keyboard = new Scanner(System.in, "UTF-8");

        //Declare reference variable sentence of reference type String which can store the
        //reference value of a String object
        //A string literal is read from the keyboard, implying the creation of a String object,
        //that contains the string, and a reference value of this object can be assigned to a
        //String reference variable
        String sentence = keyboard.nextLine();
        String substring = sentence;
        String acronym = "";

        //the trim method removes invisible characters like ' ', or tab
        substring = substring.trim();
        //The method charAt returns the character at the index of the string
        acronym += substring.charAt(0);

        int index = 0;

        //Could use string builder class instead
        //IndexOf returns -1 if the character is not in the string
        while (substring.indexOf(' ') != -1) {
            //method indexOf finds the index of the requested char in the string substring
            index = substring.indexOf(' ');
            //method substring creates a new substring from index to substring.length - 1
            //We need substring.length - 1 because a strings index starts from 0
            substring = substring.substring(index, substring.length() - 1);

            substring = substring.trim();
            acronym += substring.charAt(0);
        }

        System.out.printf("acronym= %s%n", acronym);

    }
}
