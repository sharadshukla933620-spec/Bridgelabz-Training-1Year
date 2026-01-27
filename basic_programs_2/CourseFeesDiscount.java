public class CourseFeeDiscount {
    public static void main(String[] args) {
        double fee = 125000;              // Course fee
        double discountPercent = 10;      // Discount percentage

        double discount = (fee * discountPercent) / 100; // Calculate discount
        double discountedFee = fee - discount;            // Final fee to pay

        System.out.println("Discount Amount is INR " + discount);
        System.out.println("Discounted Course Fee is INR " + discountedFee);
    }
}