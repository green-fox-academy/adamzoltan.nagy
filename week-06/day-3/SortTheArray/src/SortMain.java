import java.util.Arrays;

/**
 * Created by Adam on 2017. 04. 19..
 */
public class SortMain {
  public static void main(String[] args) {

    Integer[] intArray = {2, 4, 3, 1, 5, 0, 8 };
    sortDesc(intArray);

  }
  public static <T extends Number> void sortDesc(T[] array) {
    double [] desc = new double[array.length];
    Arrays.sort(array);
    for (int i = 0; i < array.length; i++) {
      desc [i] = array[(array.length) - i - 1].doubleValue();
    }
    for (double k : desc) {
      System.out.println(k);
    }
  }
}
