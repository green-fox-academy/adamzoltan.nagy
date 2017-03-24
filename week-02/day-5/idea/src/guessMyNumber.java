/**
 * Created by Adam on 2017. 03. 24..
 */
import java.util.Random;
import java.util.Scanner;

public class guessMyNumber {
  public static void main(String[] args) {

    Scanner rangeNum = new Scanner(System.in);
    System.out.println("      ///Guess My Number/// \nType the range of the game please.");
    int range = rangeNum.nextInt();

    Scanner lifeNum = new Scanner(System.in);
    System.out.println("Type the number of tries you have.");
    int life = lifeNum.nextInt();

    Random rand = new Random();
    int rnd = rand.nextInt(range) + 1;

    System.out.println("I thought of a number between 1 and " + range + "! Ty to guess it! You can try " + life + " times.");

    int guess = 0;

    while (guess != rnd  && life > 0) {
      Scanner guessNum = new Scanner(System.in);
      guess = guessNum.nextInt();
      if (guess < rnd) {
        System.out.println("The stored number is higher");
        life -=1;
        System.out.println("You have " + life +" more tries!");
      } else if (guess > rnd) {
        System.out.println("The stored number is lower");
        life -=1;
        System.out.println("You have " + life +" more tries!");
      }
    }
    if (life > 0) {
      System.out.println("\n    CONGRATULATIONS! \nYou found the number: " + rnd + "\n Thank you for playing!");
    } else {
      System.out.println("\n      GAME OVER \nYou have no more tries\n Thank you for playing!");
    }
  }
}
