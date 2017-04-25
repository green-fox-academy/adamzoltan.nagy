import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adam on 2017. 04. 25..
 */
public class Garden {
  private List <Plants> garden;

  public Garden() {
    this.garden = new ArrayList<>();
  }

  public void addPlant(Plants plants) {
    garden.add(plants);
  }

  public void gardenStatus() {
    for (int i = 0; i < garden.size(); i++) {
      if (garden.get(i).getWaterLevel() < garden.get(i).getWaterLimit()) {

      }
      System.out.println("The " + garden.get(i).getColor() + " " + garden.get(i).getClass().getName() + ((garden.get(i).getWaterLevel() < garden.get(i).getWaterLimit()) ? " needs water." : " doesnt need water." ));
    }
  }
}
