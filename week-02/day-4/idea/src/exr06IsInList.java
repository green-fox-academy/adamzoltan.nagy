/**
 * Created by Adam on 2017. 03. 23..
 */
import java.util.*;

public class exr06IsInList {
  public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));

    if (list.contains(4) && list.contains(8) && list.contains(12) && list.contains(16)) {
      System.out.println("True");
    } else {
      System.out.println("False");
    }
    if (list.indexOf(4) > 0 && list.indexOf(8) > 0 && list.indexOf(12) > 0 && list.indexOf(16) > 0) {
      System.out.println("True");
    } else {
      System.out.println("False");
    }
  }
}
