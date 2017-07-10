/**
 * Created by Adam on 2017. 07. 10..
 */
public class Palindrome {
  public static boolean isPalindrome(String input) {
    String reverse = "";
    int l = input.length();
    for (int i = 0; i < l; i++) {
      reverse = reverse + input.substring(l-i-1,l-i);
    }
    return reverse.equals(input);
  }

  public static boolean isPalindrome2(String input) {
    int counter = 0;
    int l = input.length();
    for (int i = 0; i < input.length(); i++) {
      if(input.substring(i, i+1).equals(input.substring(l-i-1,l-i))) {
        counter ++;
      }
    }
    return counter == input.length();
  }

}
