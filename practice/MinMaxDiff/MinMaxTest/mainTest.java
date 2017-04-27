import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Adam on 2017. 04. 27..
 */
public class mainTest {
  @Test
  public void minMaxDiffTest1() throws Exception {
    ArrayList<Integer> testList = new ArrayList<>();
    for (int i = 0; i <= 10; i++) {
      testList.add(i);
    }
    assertEquals(10,main.minMaxDiff(testList));
  }

  @Test
  public void minMaxDiffTest2() throws Exception {
    ArrayList<Integer> testList = new ArrayList<>();
    assertEquals(0,main.minMaxDiff(testList));
  }

  @Test
  public void minMaxDiffTest3() throws Exception {
    ArrayList<Integer> testList = new ArrayList<>();
    testList.add(1);
    assertEquals(0,main.minMaxDiff(testList));
  }

}