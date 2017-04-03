public class Animal {
  private int hunger;
  private int thirst;

  public Animal() {
    this (50,50);
  }

  public Animal (int hunger, int thirst) {
    this.hunger = hunger;
    this.thirst = thirst;
  }

  public void animalStat() {
    System.out.println(hunger);
    System.out.println(thirst);
  }
}
