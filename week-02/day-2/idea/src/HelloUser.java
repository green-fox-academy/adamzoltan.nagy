/**
 * Created by Adam on 2017. 03. 21..
 */
import java.util.Scanner;
public class HelloUser {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Type your name please!");
      String userInput = scanner.nextLine();

    System.out.println("Hello, " + userInput + "!");


  }
}
