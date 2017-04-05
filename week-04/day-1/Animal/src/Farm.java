import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adam on 2017. 04. 05..
 */
public class Farm {
  private List<Animal> animals;
  private int animalSlots;

  public Farm() {
    this.animals = new ArrayList<>();
    this.animalSlots  = 5;
  }

  public void breed (Animal animal) {
    if (animalSlots > 0) {
      animals.add(animal);
      animalSlots --;
    }
    else {
      System.out.println("There is no more space for a new animal");
    }
  }

  public void slaugther () {
    int leastHungerAnimal = 0;
    int hungerLevel = 101;
    for (int i = 0; i < animals.size(); i++) {
      if ((animals.get(i).getHunger()) < hungerLevel) {
        leastHungerAnimal = i;
        hungerLevel = animals.get(i).getHunger();
      }
    }
    animals.remove(leastHungerAnimal);
    System.out.println("The animal number: " + (leastHungerAnimal + 1)  + " has been slaugthered!");
  }

}
