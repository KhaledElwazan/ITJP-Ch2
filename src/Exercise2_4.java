import java.util.Scanner;
public class Exercise2_4 {
    public static void main(String[] args) {
       /*
        (Convert square meter into ping) Write a program that converts square meter into ping.
        The program prompts the user to enter a number in square meter, converts it to ping,
        and displays the result. One square meter is 0.3025 ping.

        Enter a number in square meters: 50
        50.0 square meters is 15.125 pings
       */

        // create a scanner
        Scanner input = new Scanner(System.in);

        // get square meters from user
        System.out.print("Enter number in square meters: ");
        double squareMeters = input.nextDouble();

        // convert square meters to pings ( One square meter is 0.3025 ping )
        double pings = squareMeters * 0.3025;

        // print pings
        System.out.println(squareMeters + " square meters is " + pings  + " pings");
    }
}
