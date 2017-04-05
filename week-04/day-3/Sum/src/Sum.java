import java.util.ArrayList;

/**
 * Created by Adam on 2017. 04. 05..
 */
public class Sum {
  public int sumElements (ArrayList<Integer>a) {
    if (a.equals(null)) {
      return 0;
    }else {
      int sum = 0;
      for (int i = 0; i < a.size(); i++) {
        sum = sum + a.get(i);
      }
      return sum;
    }
  }

}

