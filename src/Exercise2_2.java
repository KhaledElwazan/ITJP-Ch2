import java.util.Scanner;

public class Exercise2_2 {
    public static void main(String[] args) {
        /*
        (Compute the volume of a triangle) Write a program that reads in the length of
        sides of an equilateral triangle and computes the area and volume using the following formulas:

        area = (sqrt(3) / 4) * sqr(length of sides)

        volume = area * length

        Here is a sample run:

        Enter length of the sides and height of the Equilateral triangle:
         3.5
        The area is 3.89
        The volume of the Triangular prism is 19.48
        */

        // create a scanner
        Scanner input = new Scanner(System.in);

        // get triangle length from the user
        System.out.print("Enter length of the sides and height of Equilateral triangle: ");
        double length =input.nextDouble();

        // compute area ( area = (sqrt(3) / 4) * sqr(length of sides) )
        double area = (Math.sqrt(3) / 4) * length * length;

        // compute volume ( volume = area * length )
        double volume = area * length;

        // print the area
        System.out.println("The area is " + (int)(area * 100) / 100.0);

        // print the volume
        System.out.println("The volume of Triangular prism is " + (int)(volume * 100) / 100.0);
    }
}
