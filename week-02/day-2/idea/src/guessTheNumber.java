/**
 * Created by Adam on 2017. 03. 23..
 */
import java.util.Random;
import java.util.Scanner;

public class guessTheNumber {
  public static void main(String[] args) {

    Random rand = new Random();
    int rnd = rand.nextInt(20) + 1;

    System.out.println(rnd);

    System.out.println("I thought of a number between 1 and 20! Ty to guess it!");

    int guess = 0;

    while (guess != rnd) {
      Scanner scanner = new Scanner(System.in);
      guess = scanner.nextInt();
      if (guess < rnd) {
        System.out.println("The stored number is higher");
      } else if (guess > rnd) {
        System.out.println("The stored number is lower");
      }
    }
    System.out.println("You found the number: " + rnd);
  }
}

