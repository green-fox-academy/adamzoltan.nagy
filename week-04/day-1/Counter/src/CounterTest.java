/**
 * Created by Adam on 2017. 04. 03..
 */
public class CounterTest {
  public static void main(String[] args) {
    Counter num1 = new Counter();
    Counter num2 = new Counter(42);

    num1.add();
    num2.add(42);

    num1.get();
    num2.get();

    num2.reset();
    num1.reset();

    num2.get();
    num1.get();
  }
}
