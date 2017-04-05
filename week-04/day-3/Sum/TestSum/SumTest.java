import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Adam on 2017. 04. 05..
 */
public class SumTest {
  @Test
  public void testSumElements() throws Exception {
    Sum mySum = new Sum();
    ArrayList<Integer>testlist = new ArrayList<>();
    for (int j =0; j < 6; j++) {
      testlist.add(j);
    }
    assertEquals(15,mySum.sumElements(testlist));
  }

  @Test
  public void testSumElementsEmpty() throws Exception {
    Sum mySum = new Sum();
    ArrayList<Integer>testlist = new ArrayList<>();
    for (int j = 0; j < 0; j++) {
      testlist.add(j);
    }
    assertEquals(0,mySum.sumElements(testlist));
  }

  @Test
  public void testsumElementsOne() throws Exception {
    Sum mySum = new Sum();
    ArrayList<Integer>testlist = new ArrayList<>();
    for (int j = 1; j <= 1; j++) {
      testlist.add(j);
    }
    assertEquals(1,mySum.sumElements(testlist));
  }

  @Test
  public void testsumElementsNull() throws Exception {
    Sum mySum = new Sum();
    ArrayList<Integer>testlist = new ArrayList<>();
    testlist = null;
    assertEquals(0,mySum.sumElements(testlist));
    }
}

