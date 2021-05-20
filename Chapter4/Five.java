/*
Write a program that reads a line of text from the keyboard in which substrings are
separated by by the character literal '|'.
The program should then print each substring on a new line
 */
package Chapter4;

import java.util.Scanner;

public class Five {

    public static void main(String[] args) {

        System.out.println("Please enter a line of substrings separated by |: ");
        Scanner keyboard = new Scanner(System.in, "UTF-8");
        String sentence = keyboard.nextLine();
        String substring = sentence;
        String separatedString = "";

        int index = substring.indexOf('|');
        while (index != -1) {
            index = substring.indexOf('|');
            if (index == -1) {
                System.out.printf("%s%n", substring);
            } else if (index > 0) {
                separatedString = substring.substring(0, index);
                System.out.printf("%s%n", separatedString);
                substring = substring.substring(index + 1);
            }
        }
    }
}
