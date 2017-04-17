/**
 * Created by Adam on 2017. 04. 17..
 */
public class Pirate {

  private int drunkness = 0;
  private boolean alive = true;
  private boolean awake = true;

  public void drinkSomeRum() {
    setDrunkness(getDrunkness() + 1);
  }

  public void howItGoingMate() {
    if (isAlive()) {
      if (getDrunkness() > 4) {
        System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        setAwake(false);
        setDrunkness(0);
      } else {
        System.out.println("Pour me anudder!");
      }
    } else {
      System.out.println("This pirate is dead.");
    }
  }

  public void die() {
    setAlive(false);
  }

  public void brawl(Pirate pirate) {
    if (pirate.isAlive()) {
      int brawlResult = 1 + (int)(Math.random() * 3);
      switch (brawlResult) {
        case 1:
          pirate.die();
          break;
        case 2:
          this.die();
          break;
        case 3:
          this.die();
          pirate.die();
          break;
      }
    } else {
      System.out.println("This pirate can't fight, he is dead...");
    }
  }

  public int getDrunkness() {
    return drunkness;
  }

  public void setDrunkness(int drunkness) {
    this.drunkness = drunkness;
  }

  public boolean isAlive() {
    return alive;
  }

  public void setAlive(boolean alive) {
    this.alive = alive;
  }

  public boolean isAwake() {
    return awake;
  }

  public void setAwake(boolean awake) {
    this.awake = awake;
  }
}
