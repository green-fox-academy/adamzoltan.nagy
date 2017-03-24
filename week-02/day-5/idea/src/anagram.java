/**
 * Created by Adam on 2017. 03. 24..
 */
import java.util.Scanner;
import java.util.Arrays;

public class anagram {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    System.out.println("Type a word please.");
    String word1 = scanner.nextLine();
    System.out.println("Type another word please.");
    String word2 = scanner.nextLine();

    if (isAnagram(word1, word2)) {
      System.out.println(word1 + " & " + word2 + " are anagrams!");
    } else {
      System.out.println(word1 + " & " + word2 + " are NOT anagrams!");
    }
  }

    public static boolean isAnagram (String s1, String s2) {
      char [] arrayS1 = s1.toCharArray();
      char [] arrayS2 = s2.toCharArray();

      Arrays.sort(arrayS1);
      Arrays.sort(arrayS2);

      return Arrays.equals(arrayS1, arrayS2);
    }
}
