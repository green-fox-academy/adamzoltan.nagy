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
    if (isAlive()) {
      setDrunknessLevel(getDrunknessLevel() + 1);
      System.out.println(name + " drank some spiced rum!");
    }
    else {
      System.out.println(name + " th' scurvy pirate be in Davy Jones' treasure chest.");
    }
  }

  public void howsItGoingMate() {
    if (isAlive()) {
      if (getDrunknessLevel() <= 4) {
      System.out.println("Pour me anudder!");
      } else {
        System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?\nZzzzzz");
        setDrunknessLevel(0);
      }
    } else {
      System.out.println(name + " th' scurvy pirate be in Davy Jones' treasure chest.");
    }
  }

  public void die() {
    if (isAlive()) {
      setAlive(false);
      System.out.println(name + " th' scurvy pirate died!");
    }
    else {
      System.out.println(name + " th' scurvy pirate be already in Davy Jones' treasure chest");
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
