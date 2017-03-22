/**
 * Created by Adam on 2017. 03. 22..
 */
import java.util.Scanner;
public class exr26 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please type a number!");
    int number1 = scanner.nextInt();

    for (int i = 1; i <= 10; i++ ) {
      int multip = i * number1;
      System.out.print(i + " * " + number1 + " = ");
      System.out.println(multip);
    }
  }
}
