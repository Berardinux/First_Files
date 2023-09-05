import java.util.Scanner;
import java.util.Random;

public class completeJavaProgram {
  public static void main(String [] args) {
    //Declare local variables
    char playAgain = 'y';

    //Loop the game over and over until the user decides to not play again
    do {
      playAgain = playGame();
    } while (playAgain == 'y' || playAgain == 'Y');
    System.out.println("Thanks for playing!");
  }
  public static char playGame() {
    //Declare local variables
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a value: ");
    int x = Integer.parseInt(scanner.nextLine());
    char answer;
    Scanner kb = new Scanner(System.in);
    int numberToGuess = 0;
    int guess = 0;
    int guesses = 0;
    boolean success = false;

    numberToGuess = new Random().nextInt(x);
    numberToGuess++;
    do {
      System.out.println("I'm thinking of a number between 1 and 100. Try to guess it!");
      guess = kb.nextInt();
      guesses++;

      System.out.println(numberToGuess);

      if (guess == numberToGuess) {
        System.out.println("You guessed correct! It only took you " + guesses + " guesses!");
        success = true;
      }
      else if (guess > numberToGuess) {
        System.out.println("Sorry, that guess was too high.");
      }
      else {
        System.out.println("Sorry, that guess was too low.");
      }
  } while (success == false);
    //Ask the user if they want to continue
    System.out.println("Do you wish to play again? (y/n)");
    answer = kb.next().charAt(0); //Retrieve just the first character of their response
    kb.close();
    scanner.close();
    return answer;
  }
}