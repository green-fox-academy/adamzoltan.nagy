/**
 * Created by Adam on 2017. 03. 22..
 */
import java.util.Scanner;
public class exr25 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please type a number!");
      int number1 = scanner.nextInt();
      System.out.println("Please type another number!");
      int number2 = scanner.nextInt();

      if (number1 >= number2){
        System.out.println("The second number should be bigger");
      }
      else {
        for (int i = number1; i < number2; i++ ) {
          System.out.println(i);
        }
      }

      }
  }

