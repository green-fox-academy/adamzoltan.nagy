/**
 * Created by Adam on 2017. 04. 03..
 */
public class Travel {
  public static void main(String[] args) {
    Car car1 = new Car();
    Station station1 = new Station();

    car1.carStatus();
    station1.stationStatus();
    station1.refill(station1,car1);
    car1.carStatus();
    station1.stationStatus();
  }
}
