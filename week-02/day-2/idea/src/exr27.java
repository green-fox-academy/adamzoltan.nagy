/**
 * Created by Adam on 2017. 03. 22..
 */
import java.util.Scanner;
public class exr27 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please type a number!");
    int number1 = scanner.nextInt();

    for (int i = 1; i<=number1; i++ ) {
      for (int j = 1; j<=i; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}
