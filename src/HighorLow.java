import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(10) + 1;
        Scanner scanner = new Scanner(System.in);
        int userGuess;

        do {
            System.out.println("Please guess a number between 1 and 10:");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer number:");
                scanner.next();
            }
            userGuess = scanner.nextInt();
        } while (userGuess <= 0 || userGuess > 10);

        System.out.println("The generated number was: " + randomNumber);

        if(userGuess < randomNumber) {
            System.out.println("Your guess was too low.");
        } else if(userGuess > randomNumber) {
            System.out.println("Your guess was too high.");
        } else {
            System.out.println("Your guess was correct.");
        }
    }
}
