/**
 * Created by Adam on 2017. 03. 22..
 */
public class chessTable {
  public static void main(String[] args) {
    for (int i = 1; i <= 8; i++) {
      if (i % 2 != 0 ) {
        for (int j = 0; j < 4; j++) {
          System.out.print("% ");
        }
        System.out.println("");
      } else {
        for (int k = 0; k < 4; k++) {
          System.out.print(" %");
        }
        System.out.println("");
      }
    }
  }
}
