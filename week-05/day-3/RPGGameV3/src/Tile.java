/**
 * Created by Adam on 2017. 04. 12..
 */
public class Tile extends GameObject {
  boolean floor;

  public Tile (int posX, int posY, boolean floor) {
    super(posX,posY,floor ? "floor.png" : "wall.png");
  }
}
