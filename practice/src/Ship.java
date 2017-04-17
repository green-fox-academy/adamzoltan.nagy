import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adam on 2017. 04. 17..
 */
public class Ship {
  private List <Pirate> ship;

  public Ship() {
    this.ship = new ArrayList<>();
  }

  public void fillShip() {
    Pirate captain = new Pirate();
    ship.add(captain);
    for (int i = 0; i < 10 + (int)(Math.random()*41); i++) {
      Pirate pirate = new Pirate();
      this.ship.add(pirate);
    }
  }

  public void logBook() {
    int counter = 0;
    System.out.println("The captain of tis ship drank " + ship.get(0).getDrunkness() + " glasses of rum.");
    System.out.println("The captain is " + (ship.get(0).isAwake() ? "awake" : "passed out") + " and " + (ship.get(0).isAlive() ? "alive." : "dead."));
    for (int i = 0; i < ship.size(); i++) {
      if (ship.get(i).isAlive()) {
        counter ++;
      }
    }
    System.out.println("The ship has " + counter + " alive pirates in the crew.");
  }
}
