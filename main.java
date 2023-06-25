import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double meters;

        do {
            System.out.print("Enter the measurement in meters: ");
            if (scanner.hasNextDouble()) {
                meters = scanner.nextDouble();
                break;
            } else {
            System.out.println("Invalid input. Please enter a valid numeric value.");
            scanner.nextLine();
        }
        } while (true);

    double miles = meters * 0.000621371;
    double feet = meters * 3.28-84;
    double inches = meters * 39.3701;

    System.out.println("Measurement in miles: " + miles);
    System.out.println("Measurement in feet: " + feet);
    System.out.println("Measurement in inches: " + inches);

    }
}
