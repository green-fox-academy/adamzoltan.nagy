import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adam on 2017. 04. 25..
 */
public class Carrier {
  private List<Aircraft> carrier;
  private int storedAmmo;
  private int healthPoint;

  public Carrier(int storedAmmo, int healthPoint) {
    this.carrier = new ArrayList<>();
    this.storedAmmo = storedAmmo;
    this.healthPoint = healthPoint;
  }

  public int getStoredAmmo() {
    return storedAmmo;
  }

  public void setStoredAmmo(int storedAmmo) {
    this.storedAmmo = storedAmmo;
  }

  public int getHealthPoint() {
    return healthPoint;
  }

  public void setHealthPoint(int healthPoint) {
    this.healthPoint = healthPoint;
  }
}
