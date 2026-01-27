import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take input
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        // calculate quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // print result
        System.out.println("The Quotient is " + quotient +
                " and Remainder is " + remainder +
                " of two numbers " + number1 + " and " + number2);

        sc.close();
    }
}