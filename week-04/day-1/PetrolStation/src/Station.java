import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Adam on 2017. 04. 03..
 */
public class Station {
  int gasAmount;

  public Station() {
    gasAmount = 10000;
  }

  public void refill (Station station,Car car) {
    gasAmount = station.gasAmount - car.capacity;
    car.gasAmount = car.capacity;
    car.capacity = car.capacity - car.gasAmount;
    System.out.println("Refilling...");
  }

  public void stationStatus() {
    System.out.println("Station gas amount: " + gasAmount);
  }
}
