import java.util.Scanner;
import java.util.Random;

public class guessingGame {
    public static void main (String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            Random random = new Random();
            boolean keepPlaying = true;

            System.out.println("Let's play a guessing game");

            while (keepPlaying) {
                boolean validInput;
                int number;
                int guess;
                String answer;

                number = random.nextInt(10) + 1;
                System.out.println("I am thinking of a number between 1 - 10");
                System.out.println("What do you think it is?");

                do {
                    guess = input.nextInt();
                    validInput = true;
                    if ((guess < 1) || (guess > 10)) {
                        System.out.println("The number should be between 1 - 10. Please try again:");
                        validInput = false;
                    }
                } while (!validInput);

                if (guess == number) {
                    System.out.println("You are right!");
                } else {
                    System.out.println("You are wrong. The number was: " + number);
                }
                do {
                    System.out.println("Do you want to play again? (Y or N)");
                    answer = input.next();
                    validInput = true;
                    if (answer.equalsIgnoreCase("Y")) {
                        break;
                    } else if (answer.equalsIgnoreCase("N")) {
                        keepPlaying = false;
                        break;
                    } else {
                        validInput = false;
                    }
                } while (!validInput);
            }
        }
        System.out.println("Thank you for playing this game");
    }
}