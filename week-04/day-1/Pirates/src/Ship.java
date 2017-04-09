import javax.smartcardio.CommandAPDU;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adam on 2017. 04. 08..
 */
public class Ship {
  private List<Pirate> pirateShip;

  public Ship() {
    this.pirateShip = new ArrayList<>();
  }

  public void addCrew(Pirate pirate) {
    pirateShip.add(pirate);
  }

  public void fillShip() {
    addCrew(new Captain());
    int crewNumber = 10 +  (int)(Math.random() * 41 );
    addCrew(new Captain());
    for (int i = 0; i <= crewNumber; i++) {
      addCrew(new Pirate());
    }
  }

  public void shipStatus() {
    int crewCounter = 0;
    System.out.println("The captain of the ship is " + pirateShip.get(0).getName()+ "\n" + pirateShip.get(0).getName() + " drank " + pirateShip.get(0).getDrunknessLevel() + " glass of spicy rums.");
    for (int i = 0; i < pirateShip.size() - 1; i++) {
      if (pirateShip.get(i).isAlive()) {
        crewCounter ++;
      }
    }
    System.out.println("The ship has " + crewCounter + " scurvy pirates on the board!");
  }
}
