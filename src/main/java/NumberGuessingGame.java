import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int numGuesses = 0;
        boolean hasWon = false;

        System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");

        while (numGuesses < 5) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            numGuesses++;

            if (guess == secretNumber) {
                System.out.println("Congratulations, you guessed the number in " + numGuesses + " tries!");
                hasWon = true;
                break;
            } else if (guess < secretNumber) {
                System.out.println("Your guess is too low. Try again.");
            } else {
                System.out.println("Your guess is too high. Try again.");
            }
        }

        if (!hasWon) {
            System.out.println("Sorry, you didn't guess the number in 5 tries. The number was " + secretNumber + ".");
        }

        scanner.close();
    }
}
