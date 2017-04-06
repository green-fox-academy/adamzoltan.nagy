/**
 * Created by Adam on 2017. 04. 06..
 */
public class Flower extends Plant {

  public Flower(String color) {
    super(color);
    setWaterLevel(1.);
    setType("Flower");
    setAbsorbtion(0.75);
    setWaterLimit(5);
  }
}
