/**
 * Created by Adam on 2017. 03. 30..
 */
public class Counter {
  public static void main(String[] args) {
    System.out.println(counterRecursive(10));
  }


  public static int counterRecursive (int n) {
    if (n == 0) {
      return 0;
    } else {
      System.out.println(n);
      return counterRecursive(n -1);
    }
  }
}
