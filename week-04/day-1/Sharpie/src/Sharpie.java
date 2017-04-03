/**
 * Created by Adam on 2017. 04. 03..
 */
public class Sharpie {
  String color;
  float width;
  float inkAmount;

  public Sharpie (String color, float width) {
    this.color = color;
    this.width = width;
    this.inkAmount = 100f;
  }

  public void use () {
    this.inkAmount = this.inkAmount - 0.1f;
    System.out.println(inkAmount);
  }
}

