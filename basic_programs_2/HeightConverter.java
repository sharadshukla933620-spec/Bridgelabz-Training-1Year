import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take input for height in cm
        System.out.print("Enter your height in centimeters: ");
        double heightCm = sc.nextDouble();

        // convert cm to total inches
        double totalInches = heightCm / 2.54;

        // convert inches to feet
        int feet = (int) totalInches / 12;

        // remaining inches
        double inches = totalInches % 12;

        // print output
        System.out.println("Your Height in cm is " + heightCm +
                " while in feet is " + feet +
                " and inches is " + inches);

        sc.close();
    }
}




