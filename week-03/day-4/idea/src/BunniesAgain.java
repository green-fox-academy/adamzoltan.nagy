/**
 * Created by Adam on 2017. 03. 30..
 */
public class BunniesAgain {
  public static void main(String[] args) {
    System.out.println(bunnies(10));
  }
  public static int bunnies (int n) {
    if (n == 0) {
      return 0;
    } else if (n % 2 == 0) {
      return 2 + bunnies(n-1);
    } else {
      return 3 + bunnies(n-1);
    }
  }
}
