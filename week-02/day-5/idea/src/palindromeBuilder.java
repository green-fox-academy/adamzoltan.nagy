/**
 * Created by Adam on 2017. 03. 24..
 */
import java.util.Scanner;

public class palindromeBuilder {
  public static void main(String[] args) {
    Scanner wordInput = new Scanner (System.in);
    System.out.println("Let's build a palindrome!\n Type in a word please!");
    String word = wordInput.nextLine();
    System.out.println("This is your palindrome: " + palindromeBuilder(word));
  }

  public static String palindromeBuilder (String p1) {
    String reverse = "";
    for ( int i = p1.length() - 1; i >= 0; i--) {
      reverse = reverse + p1.charAt(i);
    }
    reverse = p1.concat(reverse);
    return reverse;
  }

}
