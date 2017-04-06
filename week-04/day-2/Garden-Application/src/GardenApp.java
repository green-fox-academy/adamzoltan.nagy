/**
 * Created by Adam on 2017. 04. 06..
 */
public class GardenApp {
  public static void main(String[] args) {
    Garden myGarden = new Garden();

    Plant flower1 = new Flower("yellow");
    Plant flower2 = new Flower("blue");
    Plant tree1 = new Tree("purple");
    Plant tree2 = new Tree("orange");

    myGarden.addPlant(flower1);
    myGarden.addPlant(flower2);
    myGarden.addPlant(tree1);
    myGarden.addPlant(tree2);

    myGarden.printStatus();
    myGarden.watering(40);
    myGarden.printStatus();
    myGarden.watering(70);
    myGarden.printStatus();
  }

}

