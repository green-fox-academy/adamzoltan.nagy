/**
 * Created by Adam on 2017. 03. 22..
 */
public class fizzBuzz {
  public static void main(String[] args) {
    for (int i=1; i <=100; i++) {
      if (i % 3 == 0 && i % 5 != 0) {
        System.out.println("Fizz!");
      } else if (i % 5 == 0 && i % 3 != 0) {
        System.out.println("Buzz!");
      } else if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("FizzBuzz!");
      } else {
        System.out.println(i);
      }
    }
  }
}