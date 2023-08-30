import java.util.Scanner;

public class Exercise2_5 {
    public static void main(String[] args) {
        /*
        (Financial application: calculate tips) Write a program that reads the subtotal
        and the gratuity rate and then computes the gratuity and total. For example, if the
        user enters 10 for subtotal and 12% for gratuity rate, the program displays $1.2
        as gratuity and $11.2 as total. Here is a sample run:

        Enter the subtotal and a gratuity rate: 10 12
        The gratuity is $1.2 and total is $11.2
         */

        // create a scanner
        Scanner input = new Scanner(System.in);

        // get subtotal and gratuity rate from user
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();

        // compute gratuity ( gratuity = subtotal * ( gratuity rate / 100 )
        double gratuity = subtotal * (gratuityRate / 100);

        // compute total ( total = subtotal + gratuity )
        double total = subtotal + gratuity;

        // print gratuity and total
        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
    }
}
