/**
 * Created by Adam on 2017. 03. 21..
 */
import java.util.Scanner;
public class AnimalsAndLegs {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Type the number of chickens please!");
    int chickens = scanner.nextInt();
    System.out.println("Type the number of pigs please!");
    int pigs = scanner.nextInt();

    System.out.println("The animals have " + (chickens * 2 + pigs * 4) + " legs!");

  }
}
