/**
 * Created by Adam on 2017. 03. 22..
 */
import java.util.Scanner;
public class factorial {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please type a number!");
    int num = scanner.nextInt();
    System.out.println(factorio(num));
  }
  public static int factorio(int p1) {
    int fact = 1;
    for (int i = 1; i <= p1; i++) {
      fact *= i;
    }
    return fact;
  }
}
