/**
 * Created by Adam on 2017. 03. 22..
 */
public class matrix {
  public static void main(String[] args) {
    int [][] diagArray = new int[4][4];

    for(int i = 0; i < diagArray.length; i++) {
      for (int j = 0; j < diagArray.length; j++) {
        if (i == j) {
          diagArray[i][j] = 1;
        }
        System.out.print(diagArray[i][j]);
      }
      System.out.println("");
    }

  }
}
