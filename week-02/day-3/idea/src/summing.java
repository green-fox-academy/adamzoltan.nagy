/**
 * Created by Adam on 2017. 03. 22..
 */
import java.util.Scanner;
public class summing {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please type a number!");
    int num = scanner.nextInt();
    System.out.println(sum(num));
  }
  public static int sum (int p1) {
    p1 = p1*(p1+1)/2;
    return p1;
  }
}
