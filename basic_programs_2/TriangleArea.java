import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base of triangle (in inches): ");
        double base = sc.nextDouble();

        System.out.print("Enter height of triangle (in inches): ");
        double height = sc.nextDouble();

        double areaInInches = 0.5 * base * height;

        // convert to square centimeters
        double areaInCm = areaInInches * 6.4516;

        System.out.println("Area in square inches is " + areaInInches +
                " and in square centimeters is " + areaInCm);

        sc.close();
    }
}