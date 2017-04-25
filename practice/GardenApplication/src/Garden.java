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
      System.out.println("The " + garden.get(i).getColor() + " " + garden.get(i).getClass().getName() + ((garden.get(i).getWaterLevel() < garden.get(i).getWaterLimit()) ? " needs water." : " doesnt need water." ));
    }
    System.out.println();
  }

  public int needsWater () {
    int counter = 0;
    for (int i = 0; i < garden.size(); i++) {
      if (garden.get(i).getWaterLevel() < garden.get(i).getWaterLimit()) {
        counter = counter + 1;
      }
    }
    return counter;
  }

  public void watering(int waterAmount) {
    System.out.println("Watering with " + waterAmount);
    for (int i = 0; i < garden.size(); i++) {
      if (garden.get(i).getWaterLevel() < garden.get(i).getWaterLimit()) {
        garden.get(i).setWaterLevel((waterAmount/needsWater())*garden.get(i).getAbsorption());
      }
    }
  }

}
