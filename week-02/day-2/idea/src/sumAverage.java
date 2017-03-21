/**
 * Created by Adam on 2017. 03. 21..
 */
import java.util.Scanner;
public class sumAverage {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please type 5 numbers divided by enters!");
    int nm1 = scanner.nextInt();
    int nm2 = scanner.nextInt();
    int nm3 = scanner.nextInt();
    int nm4 = scanner.nextInt();
    int nm5 = scanner.nextInt();

    System.out.println("Sum:" + (nm1+nm2+nm3+nm4+nm5) + "," + " Average:" + ((nm1+nm2+nm3+nm4+nm5)/5));
  }
}
