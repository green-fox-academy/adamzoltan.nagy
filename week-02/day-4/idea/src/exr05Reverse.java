/**
 * Created by Adam on 2017. 03. 23..
 */
public class exr05Reverse {
  public static void main(String[] args) {
    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
    System.out.println(rev(reversed));
  }
  public static String rev (String p1) {
    String reverse = "";
    for ( int i = p1.length() - 1; i >= 0; i--) {
      reverse = reverse + p1.charAt(i);
    }
    return reverse;
  }

}
