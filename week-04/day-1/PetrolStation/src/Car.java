/**
 * Created by Adam on 2017. 04. 03..
 */
public class Car {
  int gasAmount;
  int capacity;

  public Car() {
    this.gasAmount = 0;
    this.capacity = 100;
  }

  public void carStatus() {
    System.out.println("Car gas Amount: " + gasAmount);
    System.out.println("Car gas capacity: " + capacity);
  }

}
