/**
 * Created by Adam on 2017. 07. 10..
 */
public class Palindrome {
  public static boolean isPalindrome(String input) {
    String reverse = "";
    for (int i = 0; i < input.length(); i++) {
      reverse = reverse + input.substring(input.length()-i-1,input.length()-i);
    }
    return reverse.equals(input);
  }

}
