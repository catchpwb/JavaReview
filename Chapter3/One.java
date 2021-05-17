/*Write a program that reads the duration of time from the user, and converts it into
the corresponding number of seconds, minutes, and hours
 */
package Chapter3;

import java.util.Scanner;

public class One {

    public static void main(String[] args) {
        System.out.println("Please enter the number of seconds: ");
        Scanner keyboard = new Scanner(System.in, "UTF-8");
        int numberOfSeconds = keyboard.nextInt();

        //Validate user input
        //Assertions are only run if run in the command line with the -ea flag
        assert numberOfSeconds >= 0 : "The number of seconds must be a positive integer";

        int seconds = numberOfSeconds % 60;
        int minutes = (numberOfSeconds / 60) % 60;
        int hours = (numberOfSeconds / 3600);

        //Validate time units are within expected limits
        //Minutes < 60, seconds < 60
        assert seconds < 60;
        assert minutes < 60;

        //Initialize units of time
        String hoursUnits = "hours";
        String minutesUnits = "minutes";
        String secondsUnits = "seconds";

        //Check if the units need to be singular or plural
        if (hours == 1) {
            hoursUnits = "hour";
        }
        if (minutes == 1) {
            minutesUnits = "minute";
        }
        if (seconds == 1) {
            secondsUnits = "second";
        }

        System.out.printf("%d %s, ", hours, hoursUnits);
        System.out.printf("%d %s, ", minutes, minutesUnits);
        System.out.printf("%d %s %n", seconds, secondsUnits);
    }
}
