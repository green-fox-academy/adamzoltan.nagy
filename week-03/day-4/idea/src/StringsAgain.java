/**
 * Created by Adam on 2017. 03. 30..
 */
public class StringsAgain {
  public static void main(String[] args) {
    String s = "xaxa xaxax xaxa";
    System.out.println(stringX(s));
  }

  public static String stringX(String s) {
    char x = 'x';
    if (s.length() < 1) {
      return s;
    } else {
      if (x == s.charAt(0)) {
        return stringX(s.substring(1));
      } else {
        return s.charAt(0) + stringX(s.substring(1));
      }
    }
  }
}

