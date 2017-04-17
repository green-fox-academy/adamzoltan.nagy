/**
 * Created by Adam on 2017. 04. 17..
 */
public class Main {
  public static void main(String[] args) {

    Ship pirateShip1 = new Ship();
    Ship pirateShip2 = new Ship();

    pirateShip1.fillShip();
    pirateShip2.fillShip();

    pirateShip1.logBook();
    pirateShip2.logBook();

    pirateShip1.battle(pirateShip2);
    pirateShip1.logBook();
    pirateShip2.logBook();

  }
}
