import java.util.Scanner;
public class Exercise2_7 {
    public static void main(String[] args) {
        /*
        (Find the number of years) Write a program that prompts the user to enter the
        minutes (e.g., 1 billion), and displays the number of years and remaining days for
        the minutes. For simplicity, assume that a year has 365 days. Here is a sample run:

        Enter the number of minutes: 1000000000
        1000000000 minutes is approximately 1902 years and 214 days
        */


        // create a scanner
        Scanner input = new Scanner(System.in);

        // get minutes from user
        System.out.print("Enter the number of minutes: ");
        int totalMinutes = input.nextInt();

        // compute remaining years and days ( year = 365 days )
        int totalDays = totalMinutes / (60 * 24);
        int remainingYears = (int)(totalDays / 365);
        int remainingDays = (int)(totalDays % 365);

        // print years and days
        System.out.println(totalMinutes + " minutes is approximately " + remainingYears + " years and " + remainingDays + " days");
    }
}
