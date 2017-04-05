import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Adam on 2017. 04. 05..
 */
public class CountLettersTest {
  @Test
  public void testCountLetters() throws Exception {
    CountLetters myCounter = new CountLetters();
    String string = "macska";
    assertEquals(2,(int)myCounter.countLetters(string).get("a"));
  }

}