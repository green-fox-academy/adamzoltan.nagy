/**
 * Created by Adam on 2017. 03. 22..
 */
import java.util.Scanner;
public class exr28 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please type a number!");
    int number1 = scanner.nextInt();

    for (int i = 1; i <= number1; i++) {
      for (int j = 1; j <= (number1 - i); j++) {
        System.out.print(" ");
      }
      for (int k =1; k <= (i * 2 - 1); k ++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}
