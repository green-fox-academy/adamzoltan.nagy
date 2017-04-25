/**
 * Created by Adam on 2017. 04. 25..
 */
public abstract class Aircraft {
  private int ammo;
  private int maxAmmo;
  private int baseDamage;

  public Aircraft(int ammo, int maxAmmo, int baseDamage) {
    this.ammo = ammo;
    this.maxAmmo = maxAmmo;
    this.baseDamage = baseDamage;
  }

  public int getAmmo() {
    return ammo;
  }

  public int getMaxAmmo() {
    return maxAmmo;
  }

  public int getBaseDamage() {
    return baseDamage;
  }

  public void setAmmo(int ammo) {
    this.ammo = ammo;
  }
  
}

