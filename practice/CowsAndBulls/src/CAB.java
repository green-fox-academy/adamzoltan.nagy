import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CAB {
  private int level;
  List<Integer> randomNumber;

  public CAB(int level) {
    this.level = level;
    this.randomNumber = new ArrayList<>();
    for (int i = 0; i < level; i++) {
      int randomN = (int) (Math.random() * 10);
      randomNumber.add(randomN);
    }
  }

  public CAB() {
    this.randomNumber = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    System.out.println();
    int userInput = scanner.nextInt();
    for (int i = 0; i < 4; i++) {
      int temp = userInput % 10;
      randomNumber.add(temp);
      userInput = userInput / 10;
    }
    Collections.reverse(randomNumber);
  }

  public static void gameCAB(int n) {
    System.out.println("I have a " + n + " digit number. Try to find it out!");
    boolean victory = false;
    CAB number = new CAB(n);
    while (!victory) {
      int counter = 0;
      CAB player = new CAB();
      ArrayList<String> result = new ArrayList<>();
      for (int i = 0; i < n; i++) {
        result.add("");
      }
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          if (number.getNumber(i) == player.getNumber(j)) {
            result.set(i, "bull ");
          }
        }
      }
      for (int i = 0; i < n; i++) {
        if (number.getNumber(i) == player.getNumber(i)) {
          result.set(i, "cow ");
          counter ++;
        }
      }
      for (String cab : result) {
        System.out.print(cab);
      }
      if (counter == n) {
        System.out.println("\nCongratulations! You found the number!");
        victory = true;
      }
    }
  }


  public int getNumber(int n) {
    return randomNumber.get(n);
  }
}
