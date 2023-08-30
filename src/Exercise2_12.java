import java.util.Scanner;

public class Exercise2_12 {
    public static void main(String[] args) {
        /*
        (Physics: finding runway length) Given an airplane’s acceleration a and take-off
        speed v, you can compute the minimum runway length needed for an airplane to
        take off using the following formula:

        length = (v * v) / 2a

        Write a program that prompts the user to enter v in meters/second (m/s) and the
        acceleration in meters/second squared (m/s2
        ), then, displays the minimum runway length. Here is a sample run:

        Enter speed and acceleration: 60 3.5
        The minimum runway length for this airplane is 514.286
        */

        // create a Scanner
        Scanner input = new Scanner(System.in);

        // get speed and acceleration: from the user
        System.out.print("Enter speed and acceleration: ");
        double v = input.nextDouble();
        double a = input.nextDouble();


        // compute the minimum length ( length = (v * v) / 2a )

        double length = (v * v) / (2 * a) ;

        // display the needed energy
        System.out.println("The minimum runway length for this airplane is " + (int)(length * 1000) / 1000.0);
    }
}
