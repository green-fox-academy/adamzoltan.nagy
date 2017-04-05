import java.util.HashMap;

/**
 * Created by Adam on 2017. 04. 05..
 */
public class CountLetters {
  public static HashMap countLetters(String string) {
    HashMap<String, Integer> dictionary = new HashMap<>();
    for (int i = 0; i < string.length(); i++) {
      if (dictionary.containsKey(string.substring(i, i + 1))) {
        dictionary.put(string.substring(i, i + 1), (dictionary.get(string.substring(i, i + 1)) + 1));
      } else {
        dictionary.put((string.substring(i, i + 1)), 1);
      }
    }
    return  dictionary;
  }
}

