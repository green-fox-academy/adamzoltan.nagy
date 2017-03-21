/**
 * Created by Adam on 2017. 03. 21..
 */
import java.util.Scanner;
public class MileToKmConverter {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Type a number please!");
    int km = scanner.nextInt();
    double mile = km * .62;
    System.out.println(km + " km = " + mile + " mile");
  }
}
