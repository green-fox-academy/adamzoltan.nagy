/**
 * Created by Adam on 2017. 04. 19..
 */
public class Car {
  CarTypes types;
  Colors color;

  public Car(CarTypes types, Colors color) {
    this.types = types;
    this.color = color;
  }

  public CarTypes getTypes() {
    return types;
  }

  public Colors getColor() {
    return color;
  }

  @Override
  public String toString() {
    return color + " " + types;
  }
}
