import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double meters;

        do {
            System.out.println("Please enter a measurement in meters:");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number:");
                scanner.next();
            }
            meters = scanner.nextDouble();
            if(meters <= 0) {
                System.out.println("Invalid input. Please enter a positive number:");
            }
        } while (meters <= 0);

        double miles = meters / 1609.34;
        double feet = meters * 3.28084;
        double inches = meters * 39.3701;

        //output statements
        System.out.printf("The measurement in miles is: %.5f%n", miles);
        System.out.printf("The measurement in feet is: %.2f%n", feet);
        System.out.printf("The measurement in inches is: %.2f%n", inches);
    }
}
