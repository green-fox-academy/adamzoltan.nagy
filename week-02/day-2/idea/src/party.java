/**
 * Created by Adam on 2017. 03. 21..
 */
import java.util.Scanner;
public class party {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Type the number of boys please!");
    long boys = scanner.nextLong();
    System.out.println("Type the number of girls please!");
    long girls = scanner.nextLong();

    if (boys == girls && (boys + girls) > 20) {
      System.out.println("The party is exellent!");
    } else if ((boys + girls) > 20 && girls / boys != 1 && girls > 0){
      System.out.println("Quite cool party!");
    } else if (boys + girls < 20 && girls > 1) {
      System.out.println("Average party...");
    } else if (girls == 0) {
      System.out.println("Sausage party ");
    }
  }
}
