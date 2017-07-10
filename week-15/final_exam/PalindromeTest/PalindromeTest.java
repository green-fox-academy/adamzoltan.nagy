import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Adam on 2017. 07. 10..
 */
class PalindromeTest {
  String palindrome = "görög";
  String notPalindrome = "alma";

  @Test
  public void testPalindromeWithPalindrome() throws Exception {
    assertEquals(true, Palindrome.isPalindrome(palindrome));
  }

  @Test
  public void testPalindromeWithNonPalindrome() throws Exception {
    assertEquals(false, Palindrome.isPalindrome(notPalindrome));
  }

  @Test
  public void testPalindrome2WithPalindrome() throws Exception {
    assertEquals(true, Palindrome.isPalindrome(palindrome));
  }

  @Test
  public void testPalindrome2WithNonPalindrome() throws Exception {
    assertEquals(false, Palindrome.isPalindrome(notPalindrome));
  }


}