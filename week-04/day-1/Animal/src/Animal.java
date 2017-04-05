public class Animal {
  private int hunger;
  private int thirst;

  public Animal (int hunger, int thirst) {
    this.hunger = hunger;
    this.thirst = thirst;
  }

  public Animal() {
    this (50,50);
  }

  public void eat() {
    this.hunger -- ;
  }

  public void drink() {
      this.thirst -- ;
    }

  public void play() {
    this.thirst ++ ;
    this.hunger ++ ;
  }

  public int getHunger() {
    return hunger;
  }

  public void animalStat() {
    System.out.println(hunger);
    System.out.println(thirst);
  }
}
