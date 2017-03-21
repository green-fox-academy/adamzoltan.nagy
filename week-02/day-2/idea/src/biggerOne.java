/**
 * Created by Adam on 2017. 03. 21..
 */
import java.util.Scanner;
public class biggerOne {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Type a number please!");
    long number1 = scanner.nextLong();
    System.out.println("Type another number please!");
    long number2 = scanner.nextLong();

    if (number1 > number2) {
      System.out.println(number1);
    } else {
      System.out.println(number2);
    }

  }
}
