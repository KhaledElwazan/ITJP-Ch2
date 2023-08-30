import java.util.Scanner;

public class Exercise2_13 {
    public static void main(String[] args) {
        /*
        (Financial application: compound value) Suppose you save $100 each month in a
        savings account with annual interest rate 3.75%. Thus, the monthly interest rate is
        0.0375/12 = 0.003125. After the first month, the value in the account becomes

        100 * (1 + 0.003125) = 100.3125
        After the second month, the value in the account becomes
        (100 + 100.3125) * (1 + 0.003125) = 200.938
        After the third month, the value in the account becomes
        (100 + 200.938) * (1 + 0.003125) = 301.878
        and so on.
        Write a program that prompts the user to enter a monthly saving amount and
        displays the account value after the sixth month. (In Exercise 5.30, you will use
        a loop to simplify the code and display the account value for any month.)


        Enter the monthly saving amount: 100
        After the first month, the account value is 100.3125
        After the second month, the account value is 200.9384765625
        After the third month, the account value is 301.8789093017578
        After the sixth month, the account value is 606.5967866995037
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
