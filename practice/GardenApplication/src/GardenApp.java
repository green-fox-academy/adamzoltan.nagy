

/**
 * Created by Adam on 2017. 04. 25..
 */
public class GardenApp {
  public static void main(String[] args) {

    Garden myGarden = new Garden();

    Plants flower1 = new Flower("yellow");
    Plants flower2 = new Flower("blue");
    Plants tree1 = new Tree("purple");
    Plants tree2 = new Tree("orange");

    myGarden.addPlant(flower1);
    myGarden.addPlant(flower2);
    myGarden.addPlant(tree1);
    myGarden.addPlant(tree2);

    myGarden.gardenStatus();
    myGarden.watering(40);
    myGarden.gardenStatus();
    myGarden.watering(70);
    myGarden.gardenStatus();

  }
}
