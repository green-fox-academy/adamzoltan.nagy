import java.util.Arrays;

/**
 * Created by Adam on 2017. 04. 05..
 */
public class Anagram {
  public static boolean isAnagram (String s1, String s2) {
    char [] arrayS1 = s1.toCharArray();
    char [] arrayS2 = s2.toCharArray();

    Arrays.sort(arrayS1);
    Arrays.sort(arrayS2);

    return Arrays.equals(arrayS1, arrayS2);
  }
}
