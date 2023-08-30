import java.util.Scanner;

public class Exercise2_9 {
    public static void main(String[] args) {
        /*
        (Physics: acceleration) Average acceleration is defined as the change of velocity
        divided by the time taken to make the change, as given by the following formula:

        a = (v1 - v0) / t

        Write a program that prompts the user to enter the starting velocity v0 in meters/
        second, the ending velocity v1 in meters/second, and the time span t in seconds,
        then displays the average acceleration. Here is a sample run:

        Enter v0, v1, and t: 5.5 50.9 4.5
        The average acceleration is 10.0889

        */

        // create a Scanner
        Scanner input = new Scanner(System.in);

        // get v0, v1, and t from the user
        System.out.print("Enter v0, v1, and t: ");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();

        // compute acceleration ( a = (v1 - v0) / t )

        double a = ((v1 - v0) / t);

        // display the average acceleration
        System.out.println("The average acceleration is " + (int)(a * 10000) / 10000.0);
    }
}
