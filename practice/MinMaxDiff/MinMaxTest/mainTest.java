import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Adam on 2017. 04. 27..
 */
public class mainTest {
  @Test
  public void minMaxDiff() throws Exception {
    ArrayList<Integer> testList = new ArrayList<>();
    for (int i = 0; i <= 10; i++) {
      testList.add(i);
    }
    assertEquals(10,main.minMaxDiff(testList));
  }

}