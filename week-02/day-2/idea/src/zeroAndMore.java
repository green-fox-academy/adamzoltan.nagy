/**
 * Created by Adam on 2017. 03. 21..
 */
import java.util.Scanner;
public class zeroAndMore {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Type a number please!");
      long number = scanner.nextLong();
      if (number <= 0) {
        System.out.println("Not enough!");
      } else if (number == 1) {
        System.out.println("One");
      } else if (number == 2) {
        System.out.println("Two");
      } else {
        System.out.println("A lot!");
      }
  }
}
