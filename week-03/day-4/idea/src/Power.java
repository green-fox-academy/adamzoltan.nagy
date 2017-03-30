/**
 * Created by Adam on 2017. 03. 30..
 */
public class Power {

  public static void main(String[] args) {

    System.out.println(power(3,2));
  }

  public static int power (int b, int p) {
    if (p == 0) {
      return 1;
    } else {
      return b * power(b, p-1);
    }
  }
}
