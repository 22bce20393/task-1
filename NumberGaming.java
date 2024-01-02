package codsoftinter;

import java.util.Random;
import java.util.Scanner;

public class NumberGaming{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 5;
        int rounds = 0;
        int totalAttempts = 0;

        do {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            int userGuess;

            System.out.println("\nRound " + (rounds + 1));
            System.out.println("Guess the number between " + minRange + " and " + maxRange);

            do {
                System.out.print("Enter your guess: ");
                userGuess = scanner.nextInt();
                
                attempts++;
               

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }

            } while (attempts < maxAttempts && targetNumber != userGuess);

            totalAttempts += attempts;
            rounds++;

            System.out.print("Do you want to play again? (1 for yes, 0 for no): ");
        } while (scanner.nextInt() == 1);

        System.out.println("Game Over!");
        System.out.println("Total Rounds Played: " + rounds);
        System.out.println("Total Attempts: " + totalAttempts);

        scanner.close();
    }
}
