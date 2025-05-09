import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int lower = 1, upper = 100, maxAttempts = 7;
        int roundsPlayed = 0, roundsWon = 0;

        System.out.println("🎮 Welcome to the Number Guessing Game!");

        boolean playAgain = true;
        while (playAgain) {
            int numberToGuess = random.nextInt(upper - lower + 1) + lower;
            int attemptsLeft = maxAttempts;
            roundsPlayed++;

            System.out.println("\n🎲 Round " + roundsPlayed + ": Guess the number between " + lower + " and " + upper);
            
            boolean guessedCorrectly = false;

            while (attemptsLeft > 0) {
                System.out.print("Enter your guess (Attempts left: " + attemptsLeft + "): ");
                int guess;
                try {
                    guess = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    continue;
                }

                if (guess < lower || guess > upper) {
                    System.out.println("Please guess a number between " + lower + " and " + upper);
                    continue;
                }

                attemptsLeft--;

                if (guess == numberToGuess) {
                    System.out.println("🎉 Correct! You guessed the number!");
                    roundsWon++;
                    guessedCorrectly = true;
                    break;
                } else if (guess < numberToGuess) {
                    System.out.println("📉 Too low!");
                } else {
                    System.out.println("📈 Too high!");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("❌ Out of attempts! The correct number was " + numberToGuess);
            }

            // Ask to play again
            System.out.print("Do you want to play another round? (yes/no): ");
            String response = scanner.nextLine().trim().toLowerCase();
            playAgain = response.equals("yes");
        }

        System.out.println("\n📊 Game Over. Rounds Played: " + roundsPlayed + ", Rounds Won: " + roundsWon);
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
