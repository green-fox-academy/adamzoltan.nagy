import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Adam on 2017. 04. 05..
 */
public class FibonacciTest {
  @Test
  public void fibonacci() throws Exception {
    Fibonacci myFibonacci = new Fibonacci();
    assertEquals(5,myFibonacci.fibonacci(5));
  }

}