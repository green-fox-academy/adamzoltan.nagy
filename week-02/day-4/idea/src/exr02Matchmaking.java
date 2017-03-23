/**
 * Created by Adam on 2017. 03. 23..
 */
import java.util.ArrayList;
import java.util.Arrays;

public class exr02Matchmaking {
  public static void main(String[] args) {
    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));
    ArrayList<String> order = new ArrayList<String>();

    for (int i = 0 ; i < boys.size(); i++) {
      if (i<girls.size()) {
        order.add(girls.get(i));
      }
        order.add(boys.get(i));
      }
    System.out.println(order);
  }
}

