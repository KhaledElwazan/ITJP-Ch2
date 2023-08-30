import java.util.Scanner;
public class Exercise2_3 {
    /*
     (Convert meters into feet) Write a program that reads a number in meters, converts
    it to feet, and displays the result. One meter is 3.2786 feet. Here is a sample run:

     Enter a value for meter: 10
     10.0 meters is 32.786 feet
     */

    public static  void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);

        // get meters from user
        System.out.print("Enter value for meter: ");
        double meters = input.nextDouble();

        // convert meters to feet ( One meter is 3.2786 feet )
        double feet = meters * 3.2786;
        //print feet
        System.out.println(meters + " meters is " + feet + " feet");
    }
}
