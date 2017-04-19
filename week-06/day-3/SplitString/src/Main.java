/**
 * Created by Adam on 2017. 04. 19..
 */
public class Main {
  public static void main(String[] args) {

  }
  public String[] splitString (String str, int n) {
    try {
      String[] splitted = new String[2];
      String string1 = str.substring(0, n - 1);
      splitted[0] = string1;
      String string2 = str.substring(n, str.length());
      splitted[1] = string2;
      return splitted;
    } catch (IndexOutOfBoundsException e) {
      return null;
    }
  }
}
