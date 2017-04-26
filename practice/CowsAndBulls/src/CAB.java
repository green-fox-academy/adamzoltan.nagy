import java.util.ArrayList;
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
    int userInput = scanner.nextInt();
  }
}
