import java.util.Scanner;
public class Exercise2_8 {
    public static void main(String[] args) {
        /*
        (Current time) Listing 2.7, ShowCurrentTime.java, gives a program that displays
        the current time in GMT. Revise the program, so it prompts the user to enter the
        time zone offset to GMT and displays the time in the specified time zone. Here is
        a sample run:

        Enter the time zone offset to GMT: -5
        The current time is 4:50:34
        */

        // create a Scanner
        Scanner input = new Scanner(System.in);

        // get time zone offset from the user
        System.out.print("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();

        // obtain the total time in seconds
        long totalSeconds = System.currentTimeMillis() / 1000;

        // compute current second
        long currentSecond = totalSeconds % 60;

        // compute current minute
        long currentMinute = (totalSeconds / 60) % 60;

        // compute current hour in GMT
        long currentHourGMT = (totalSeconds / 3600) % 24;

        // compute current hour in the specified time zone
        long currentHour = currentHourGMT + offset;

        // display the current time in the specified time zone
        System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }
}
