
public class animalTesting {
  public static void main(String[] args) {
    Animal bat1 = new Animal(10,10);
    Animal bat2 = new Animal(20,20);
    Animal bat3 = new Animal(5,30);
    Animal bat4 = new Animal(40,40);
    Animal bat5 = new Animal(50,50);
    Animal bat6 = new Animal(50,50);


    bat1.animalStat();

    bat1.drink();
    bat1.eat();

    bat1.animalStat();

    bat1.play();

    bat1.animalStat();

    Farm batFarm = new Farm();
    batFarm.breed(bat1);
    batFarm.breed(bat2);
    batFarm.breed(bat3);
    batFarm.breed(bat4);
    batFarm.breed(bat5);
    batFarm.breed(bat6);
    batFarm.breed(bat6);
    batFarm.slaugther();
  }
}
