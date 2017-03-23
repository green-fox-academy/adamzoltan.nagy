/**
 * Created by Adam on 2017. 03. 23..
 */
import java.util.Arrays;
import java.util.ArrayList;
public class exr03AppendLatter {
  public static void main(String[] args) {
    ArrayList<String> far = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk"));
    String append = new String();
    for (int i = 0; i < far.size(); i++) {
      append = far.get(i);
      append = append.concat("a");
      far.set(i,append);
    }
    System.out.println(far);
  }
}
