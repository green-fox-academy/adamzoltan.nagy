import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adam on 2017. 04. 17..
 */
public class Ship {
  private List<Pirate> ship;

  public Ship() {
    this.ship = new ArrayList<>();
  }

  public void fillShip() {
    Pirate captain = new Pirate();
    ship.add(captain);
    for (int i = 0; i < 10 + (int) (Math.random() * 41); i++) {
      Pirate pirate = new Pirate();
      this.ship.add(pirate);
    }
  }

  public void logBook() {
    int counter = 0;
    System.out.println("The captain of this ship drank " + ship.get(0).getDrunkness() + " glasses of rum.");
    System.out.println("The captain is " + (ship.get(0).isAwake() ? "awake" : "passed out") + " and " + (ship.get(0).isAlive() ? "alive." : "dead."));
    for (int i = 0; i < ship.size(); i++) {
      if (ship.get(i).isAlive()) {
        counter++;
      }
    }
    System.out.println("The ship has " + counter + " alive pirates in the crew.\n");
  }

  public int shipScore() {
    int score = 0;
    for (int i = 0; i < ship.size(); i++) {
      if (ship.get(i).isAlive()) {
        score++;
      }
    }
    return score - ship.get(0).getDrunkness();
  }

  public boolean battle(Ship ship) {
    if (this.shipScore() > ship.shipScore()) {
      for (int i = 0; i < this.ship.size(); i++) {
        this.ship.get(i).setDrunkness(1 + (int)(Math.random()*4));
      }
      return true;
    } else {
      int killThem = 1 + (int)(Math.random()*ship.ship.size());
      for (int j = 0; j < killThem; j++) {
        ship.ship.get(j).setAlive(false);
      }
      return false;
    }
  }
}

