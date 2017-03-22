/**
 * Created by Adam on 2017. 03. 22..
 */
public class doubleItems {
  public static void main(String[] args) {
    int [] ag = {3, 4, 5, 6, 7};
    for (int i = 0; i < ag.length; i++) {
      ag[i] = ag[i] * 2;
    }
    for (int i = 0; i < ag.length; i++){
      System.out.println(ag[i]);
    }
  }
}

