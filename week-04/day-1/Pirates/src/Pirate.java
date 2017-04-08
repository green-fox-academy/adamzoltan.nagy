/**
 * Created by Adam on 2017. 04. 08..
 */
public class Pirate {
  private String name;
  private int drunknessLevel;
  private boolean alive;

  public Pirate (String name) {
    this.name = name;
    this.drunknessLevel = (0);
    this.alive = true;
  }

  public void drinkSomeRum() {
    setDrunknessLevel(getDrunknessLevel() + 1);
    System.out.println(name + " drank some spiced rum!");
  }

  public void howsItGoingMate() {
    if (getDrunknessLevel() <= 4) {
      System.out.println("Pour me anudder!");
    } else {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      setDrunknessLevel(0);
    }
  }

  public int getDrunknessLevel() {
    return drunknessLevel;
  }

  public void setDrunknessLevel(int drunknessLevel) {
    this.drunknessLevel = drunknessLevel;
  }

  public boolean isAlive() {
    return alive;
  }

  public void setAlive(boolean alive) {
    this.alive = alive;
  }

  public String getName() {
    return name;
  }
}
