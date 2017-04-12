import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adam on 2017. 04. 12..
 */
public class GameMap {
  public static int [][] wallMatrix;
  private List <Tile> tileList;


  public static int[][] getWallMatrix() {
    return wallMatrix;
  }

  public List<Tile> getTileList() {
    return tileList;
  }

  public GameMap () {
    this.wallMatrix = new int [][] {
            {0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 1, 0, 1, 1, 0},
            {0, 1, 1, 1, 0, 1, 0, 1, 1, 0},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
            {1, 1, 1, 1, 0, 1, 1, 1, 1, 0},
            {0, 1, 0, 1, 0, 0, 0, 0, 1, 0},
            {0, 1, 0, 1, 0, 1, 1, 0, 1, 0},
            {0, 0, 0, 0, 0, 1, 1, 0, 1, 0},
            {0, 1, 1, 1, 0, 0, 0, 0, 1, 0},
            {0, 0, 0, 1, 0, 1, 1, 0, 0, 0},
    };

    this.tileList = new ArrayList<>();
  }

  public void fillTileList () {
    for (int i = 0; i < wallMatrix.length; i++) {
      for (int j = 0; j < wallMatrix[i].length; j++) {
        Tile tile = new Tile(j, i, wallMatrix[i][j] == 0);
        tileList.add(tile);
      }
    }
  }

}
