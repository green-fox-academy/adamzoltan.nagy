/**
 * Created by Adam on 2017. 04. 25..
 */
public abstract class Aircraft {
  private int currentAmmo;
  private int maxAmmo;
  private int baseDamage;

  public Aircraft(int currentAmmo, int maxAmmo, int baseDamage) {
    this.currentAmmo = currentAmmo;
    this.maxAmmo = maxAmmo;
    this.baseDamage = baseDamage;
  }

  public int fightAirstrike() {
    int damage = getCurrentAmmo()*getBaseDamage();
    setCurrentAmmo(0);
    return damage;
  }

  public int refillAmmo(int ammo) {
    if (ammo > getMaxAmmo()) {
      setCurrentAmmo(getMaxAmmo());
      return ammo - getMaxAmmo();
    } else {
      setCurrentAmmo(ammo);
      return 0;
    }
  }

  public int getCurrentAmmo() {
    return currentAmmo;
  }

  public int getMaxAmmo() {
    return maxAmmo;
  }

  public int getBaseDamage() {
    return baseDamage;
  }

  public void setCurrentAmmo(int currentAmmo) {
    this.currentAmmo = currentAmmo;
  }

}

