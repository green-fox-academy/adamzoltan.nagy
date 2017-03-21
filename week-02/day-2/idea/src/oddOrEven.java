/**
 * Created by Adam on 2017. 03. 21..
 */
import java.util.Scanner;
public class oddOrEven {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Type a number please!");
      long number = scanner.nextLong();

    if (number % 2 == 0) {
      System.out.println(number +" is EVEN!");
    } else {
      System.out.println(number + " is ODD!");
    }

  }
}
