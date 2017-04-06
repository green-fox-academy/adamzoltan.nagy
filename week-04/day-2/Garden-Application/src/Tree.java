/**
 * Created by Adam on 2017. 04. 06..
 */
public class Tree extends Plant {

  public Tree(String color) {
    super(color);
    setWaterLevel(1.);
    setType("Tree");
    setAbsorbtion(0.4);
    setWaterLimit(10);
  }
}
