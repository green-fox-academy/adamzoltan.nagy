import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adam on 2017. 04. 12..
 */
public class GameMap {
  List<Tile> tileList;

  int [][] wallMatrix = {
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

  public GameMap() {
    tileList = new ArrayList<>();
    for (int i = 0; i < wallMatrix.length; i++) {
      for (int j = 0; j < wallMatrix[i].length; j++) {
        Tile tile = new Tile(j, i, wallMatrix[i][j] == 0);
        tileList.add(tile);
      }
    }
  }
}
