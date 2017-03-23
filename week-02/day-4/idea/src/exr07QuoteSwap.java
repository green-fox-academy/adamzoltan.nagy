/**
 * Created by Adam on 2017. 03. 23..
 */
import java.util.*;
public class exr07QuoteSwap {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

    String word1 = new String();
    String word2 = new String();

    for(int i = 0; i < list.size(); i ++) {
      if (i == 2) {
        word1 = list.get(i);
      } else if (i == 5) {
        word2 = list.get(i);
      }
    }
    list.set(2, word2);
    list.set(5, word1);

    for (int j = 0; j < list.size(); j++) {
      System.out.print(list.get(j) + " ");
    }
  }
}

