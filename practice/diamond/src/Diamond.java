import java.util.Scanner;

/**
 * Created by Adam on 2017. 04. 24..
 */
public class Diamond {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Type in an ODD number please!");
    int userNumber = scanner.nextInt();
    drawDiamond(userNumber);
  }

  public static void drawDiamond(int n) {
    while (n % 2 == 0) {
      System.out.println("This number is not an odd one!\nType in an ODD number please!");
      Scanner scanner = new Scanner(System.in);
      n = scanner.nextInt();
    }
    for (int i = 0; i < Math.round(n / 2); i++) {
      for (int j = Math.round(n / 2) - i; j > 0; j--) {
        System.out.print(" ");
      }
      for (int k = 0; k <= i * 2; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i = 0; i < n; i++) {
      System.out.print("*");
    }
    System.out.println();
    for (int i = 0; i < Math.round(n / 2); i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(" ");
      }
      for (int k = (n-(i*2+2)); k > 0; k--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}


