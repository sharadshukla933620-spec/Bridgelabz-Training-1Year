
import java.util.Scanner;

public class FeeDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take input for fee
        System.out.print("Enter Student Fee: ");
        double fee = sc.nextDouble();

        // take input for discount percent
        System.out.print("Enter Discount Percent: ");
        double discountPercent = sc.nextDouble();

        // compute discount
        double discount = (fee * discountPercent) / 100;

        // compute final fee
        double finalFee = fee - discount;

        // print output
        System.out.println("The discount amount is INR " + discount +
                " and final discounted fee is INR " + finalFee);

        sc.close();
    }
}