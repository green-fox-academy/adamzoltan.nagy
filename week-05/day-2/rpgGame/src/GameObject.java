/**
 * Created by Adam on 2017. 04. 12..
 */
public class GameObject {
  int posX;
  int posY;
  String picture;

  public GameObject (int posX, int posY, String picture) {
    this.posX = posX;
    this.posY = posY;
    this.picture = picture;
  }

  public int getPosX() {
    return posX;
  }

  public void setPosX(int posX) {
    this.posX = posX;
  }

  public int getPosY() {
    return posY;
  }

  public void setPosY(int posY) {
    this.posY = posY;
  }

  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }
}
