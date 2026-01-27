
public class KTM {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();

        // Conversion: 1 mile = 1.6 km
        double miles = km / 1.6;

        System.out.println("The total miles is " + miles + " miles for the given " + km + " km");

        input.close();
    }
}