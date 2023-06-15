import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width, height;

        do {
            System.out.println("Enter the width of the rectangle:");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number:");
                scanner.next();
            }
            width = scanner.nextDouble();

            System.out.println("Enter the height of the rectangle:");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Enter a number:");
                scanner.next();
            }
            height = scanner.nextDouble();
        } while (width <= 0 || height <= 0);

        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt(width * width + height * height);

        //output statements
        System.out.printf("The area of the rectangle is: %.2f%n", area);
        System.out.printf("The perimeter of the rectangle is: %.2f%n", perimeter);
        System.out.printf("The length of the diagonal of the rectangle is: %.2f%n", diagonal);
    }
}
