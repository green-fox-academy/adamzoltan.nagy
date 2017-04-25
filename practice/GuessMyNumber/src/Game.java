import java.util.Scanner;

/**
 * Created by Adam on 2017. 04. 25..
 */
public class Game {
  private int range;
  private int lives;

  public Game() {
    this.range = range;
    this.lives = lives;
  }

  public int setDifficulty() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("    .:|Guess My Number|:.\nChoose the difficulty level:\n        1 - Easy\n        2 - Medium\n        3 - Hard ");
    int difficulty = scanner.nextInt();
    if (difficulty == 1) {
      setRange(50);
      setLives(10);
    } else if (difficulty == 2) {
      setRange(100);
      setLives(7);
    } else if (difficulty == 3) {
      setRange(200);
      setLives(5);
    }
    return getRange();
  }

  public int thinkANumber() {
    int randomNumber = 1 + (int)(Math.random()*setDifficulty());
    return randomNumber;
  }

  public void guessTheNumber() {
    int n = thinkANumber();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Try to guess the number between 1 and " + getRange() +"\nYou can try " + getLives() + " times.");
    int guess = scanner.nextInt();
    while (guess != n && getLives() > 1) {
      if (guess < n) {
        setLives(getLives()-1);
        System.out.println("The number is higher. Try again!\n You have " + getLives() + " more tries");
        guess = scanner.nextInt();
      } else if (guess > n) {
        setLives(getLives()-1);
        System.out.println("The number is lower. Try again!\n You have " + getLives() + " more tries");
        guess = scanner.nextInt();
      }
    }
    if (getLives() == 1) {
      System.out.println("GAME OVER");
    } else {
      System.out.println("You guessed the correct number! Congratulations!");
    }

  }


  public int getRange() {
    return range;
  }

  public void setRange(int range) {
    this.range = range;
  }

  public int getLives() {
    return lives;
  }

  public void setLives(int lives) {
    this.lives = lives;
  }
}
