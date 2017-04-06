import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adam on 2017. 04. 06..
 */
public class Garden {
  private List<Plant> plants;

  public Garden() {
    this.plants = new ArrayList<>();
  }

  public void addPlant(Plant plant) {
    plants.add(plant);
  }

  public boolean needsWater(Integer n) {
    if (plants.get(n).getType().equals("Flower") && plants.get(n).getWaterLevel() < 5) {
      return true;
    } else if (plants.get(n).getType().equals("Tree") && plants.get(n).getWaterLevel() < 10) {
      return true;
    } else
      return false;
  }

  public void printStatus() {
    for (int i = 0; i < plants.size(); i++) {
      System.out.println("The " + plants.get(i).getColor() + " " + plants.get(i).getType() + " " + (needsWater(i) ? "needs water" : "doesnt need water"));
    }
    System.out.println("");
  }

  public void watering(double water) {
    int counter = 0;
    System.out.println("Watering with " + water);
    for (int i = 0; i < plants.size(); i++) {
      if (needsWater(i)) {
        counter++;
      }
    }
      for (int j = 0; j < plants.size(); j++) {
        if (needsWater(j)) {
          plants.get(j).setWaterLevel((water / counter) * plants.get(j).getAbsorbtion());
        }
      }
    System.out.println("");
  }
}

