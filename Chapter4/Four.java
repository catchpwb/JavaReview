/*
Write a program that reads a line of text from the keyboard and prints it back after replacing
each occurrence of any four-letter word in the text with the word "x***", where x is the first
character in the four letter word
 */
package Chapter4;

import java.util.Scanner;

public class Four {

    public static void main(String[] args) {

        System.out.println("Please enter a line of text: ");
        //Reference variable declaration
        //Declare reference variable keyboard of reference type scanner
        //keyboard stores the reference value of a scanner object
        //Creation of a scanner object
        //New creates an object of class scanner, with name given in the constructor call
        //and returns the reference value of the new object
        Scanner keyboard = new Scanner(System.in, "UTF-8");
        String sentence = keyboard.nextLine();
        String replaceSentence = "";
        String substring = sentence;

        while (replaceSentence.length() < sentence.length()) {
            int index = substring.indexOf(' ');
            //Essentially checks the last word/only word in sentence
            if (index == -1) {
                //If four letter word, append to sentence with first letter followed by
                //three asterisks
                if (substring.length() == 4) {
                    replaceSentence += substring.charAt(0) + "***";
                }
                //If the last/only word is not 4 letters add to substring without alterations
                else {
                    replaceSentence += substring;
                }
            }
            //If the next word is a four letter word print out its first letter followed by 3 asterisks
            //and a space
            else if (index == 4) {
                replaceSentence += substring.charAt(0) + "***" + ' ';
                substring = substring.substring(index + 1, substring.length());
            }
            //If the next word is not a four letter word add it to replaceSentence without
            //alterations
            else {
                replaceSentence += substring.substring(0, index) + ' ';
                substring = substring.substring(index + 1, substring.length());
            }

        }
        //Print out resulting sentence with fur letter words replaced
        System.out.printf("%s%n", replaceSentence);
    }
}
