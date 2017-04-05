import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Adam on 2017. 04. 05..
 */
public class AnagramTest {
  @Test
  public void isAnagramTest() throws Exception {
    Anagram myAnagam = new Anagram();
    String string1 = "macska";
    String string2 = "kacsma";
    assertTrue(myAnagam.isAnagram(string1,string2));
  }

}