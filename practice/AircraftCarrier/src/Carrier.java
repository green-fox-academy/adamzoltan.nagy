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

  public void addAircraft(String type) {
    if (type.equals("F16")) {
      Aircraft aircraft = new F16();
      carrier.add(aircraft);
    } else if (type.equals("F35")) {
      Aircraft aircraft = new F35();
      carrier.add(aircraft);
    }
  }

  public void fill() {
    if (getStoredAmmo() == 0) {
      System.out.println("The carrier is out of ammo");
    } else {
      for (int i = 0; i < carrier.size(); i++) {
        carrier.get(i).refillAmmo(getStoredAmmo());
        setStoredAmmo(getStoredAmmo() - carrier.get(i).getMaxAmmo());
      }
    }
  }

  public int totalDamage() {
    int totalDmg = 0;
    for (int i = 0; i < carrier.size(); i++) {
      totalDmg = totalDmg + carrier.get(i).currentDamage();
    }
    return totalDmg;
  }

  public void getStatus() {
    System.out.println("Aircraft count: " + carrier.size() + ", Ammo Storage: " + getStoredAmmo() + ", Total Damage: " + totalDamage());
    System.out.println("Aircrafts:");
    for (int i = 0; i < carrier.size(); i++) {
      carrier.get(i).getStatus();
    }
    System.out.println();
  }

  public void fight(Carrier enemyCarrier) {
    enemyCarrier.setHealthPoint((enemyCarrier.getHealthPoint()-totalDamage()));
    if (enemyCarrier.getHealthPoint() <= 0) {
      System.out.println("It's dead Jim :(");
    }
    for (int i = 0; i < carrier.size(); i++) {
      carrier.get(i).fightAirstrike();
    }
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
