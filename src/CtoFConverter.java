import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double temperatureCelsius;

        do {
            System.out.println("Please enter a temperature in Celsius:");
            while (!scanner.hasNextDouble()) {
                System.out.println("That's not a valid number! Please enter a number:");
                scanner.next();
            }
            temperatureCelsius = scanner.nextDouble();
        } while (temperatureCelsius == null);

        Double temperatureFahrenheit = temperatureCelsius * 9/5 + 32;
        // output statement
        System.out.println("The equivalent temperature in Fahrenheit is: " + temperatureFahrenheit);
    }
}