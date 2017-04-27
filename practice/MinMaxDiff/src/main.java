import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Adam on 2017. 04. 27..
 */
public class main {
  public static void main(String[] args) {

  }

  public static int minMaxDiff(ArrayList<Integer> numbers) {
    int min;
    int max;
    max = Collections.max(numbers);
    min = Collections.min(numbers);
    return max - min;
  }
}
