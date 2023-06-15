import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numberOfGallons, fuelEfficiency, pricePerGallon;

        do {
            System.out.println("Enter the number of gallons of gas in the tank:");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Enter a number:");
                scanner.next();
            }
            numberOfGallons = scanner.nextDouble();

            System.out.println("Enter the fuel efficiency in miles per gallon:");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Enter a number:");
                scanner.next();
            }
            fuelEfficiency = scanner.nextDouble();
            System.out.println("Enter the price of gas per gallon:");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Enter a number:");
                scanner.next();
            }
            pricePerGallon = scanner.nextDouble();
        } while (numberOfGallons <= 0 || fuelEfficiency <= 0 || pricePerGallon <= 0);

        double costPerHundredMiles = (100 / fuelEfficiency) * pricePerGallon;
        double distanceCarCanGo = numberOfGallons * fuelEfficiency;

        //output statements
        System.out.printf("The cost per 100 miles is: $%.2f%n", costPerHundredMiles);
        System.out.printf("The car can go %.2f miles with the gas in the tank.%n", distanceCarCanGo);
    }
}
