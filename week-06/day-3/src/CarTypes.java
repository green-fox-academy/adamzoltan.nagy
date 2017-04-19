/**
 * Created by Adam on 2017. 04. 19..
 */
public enum CarTypes {
  ASTONMARTIN, AUDI, BMW, BUGATTI, FERRARI, LAMBORGHINI, MASERATI, MERCEDES, TESLA;

  static int enumSize = CarTypes.values().length;

  static CarTypes getCarType() {
     return CarTypes.values()[(int)(Math.random()*enumSize)];
  }
}
