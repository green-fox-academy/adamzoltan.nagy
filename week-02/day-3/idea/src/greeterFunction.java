/**
 * Created by Adam on 2017. 03. 22..
 */
public class greeterFunction {
  public static void main(String[] args) {
    String al = "Greenfox";
    System.out.println(greet(al));
  }
  public static String greet (String p1) {
    p1 = "Greetings dear, " + p1;
    return p1;
  }

}
