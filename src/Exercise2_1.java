import java.util.Scanner;
public class Exercise2_1 {
    public static void main(String[] args) {

/*
    Convert mile to kilometer) Write a program that reads a mile in a double value
    from the console, converts it to kilometers, and displays the result. The formula
    for the conversion is as follows:
    1 mile = 1.6 kilometers

    Here is a sample run:

    Enter miles: 96
    96 miles is 153.6 kilometers
*/


        Scanner input = new Scanner(System.in);

        // get miles from user
        System.out.print("Enter miles: ");
        double miles = input.nextDouble();

        // convert miles to kilometers ( 1 mile = 1.6 kilometer )
        double kilometers = (int)(miles * 1.6 * 100) / 100.0;

        // print kilometers
        System.out.println((int)miles + " miles is " + kilometers + " kilometers")  ;
    }
}
