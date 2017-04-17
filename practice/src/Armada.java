import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adam on 2017. 04. 17..
 */
public class Armada {
  private List<Ship> armada;

  public Armada() {
    this.armada = new ArrayList<>();
  }

  public void addShip(Ship ship) {
    armada.add(ship);
  }

  public boolean war(Armada armada) {
    while (this.armada.size() != 0 || armada.armada.size() != 0) {
      if (this.armada.get(0).battle(armada.armada.get(0))) {
        armada.armada.remove(0);
      } else {
        this.armada.remove(0);
      }
    }
    if (this.armada.size()> 0) {
      System.out.println("Armada 1 won");
      return true;
    } else {
      System.out.println("Armada 2 won");
      return false;
    }
  }

}
