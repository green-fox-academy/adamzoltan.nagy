import java.util.List;

/**
 * Created by Adam on 2017. 04. 17..
 */
public class Ship {
  private List <Pirate> ship;

  private void fillShip() {
    Pirate captain = new Pirate();
    ship.add(captain);
    for (int i = 0; i < 1 + (int)(Math.random()*49); i++) {
      Pirate pirate = new Pirate();
      ship.add(pirate);
    }
  }

  private void logBook() {
    System.out.println("The captain of tis ship drank " + ship.get(0).getDrunkness() + " glasses of rum.");
    System.out.println("The captain is " + (ship.get(0).isAwake() ? "awake" : "passed out") + " and " + (ship.get(0).isAlive() ? "alive" : "dead"));
  }
}
