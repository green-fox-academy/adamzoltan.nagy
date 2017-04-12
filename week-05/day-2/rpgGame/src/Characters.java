/**
 * Created by Adam on 2017. 04. 12..
 */
public class Characters extends GameObject {
  private int maxHP;
  private int currentHP;
  private int DP;
  private int SP;
  private int lvl;

  public Characters (int posX, int posY, String picture) {
    super(posX,posY,picture);
  }

  public void moveUp () {
    if (getPosY() != 0) {
    setPosY(getPosY() - 72);
    }
  }

  public void moveDown () {
    if (getPosY() != 648)
    setPosY(getPosY() + 72);
  }

  public void moveLeft () {
    if (getPosX() != 0) {
      setPosX(getPosX() - 72);
    }
  }

  public void moveRight () {
    if (getPosX() != 648) {
      setPosX(getPosX() + 72);
    }
  }

  public int rolld6 () {
    int d6 = 1 + (int)(Math.random()*6);
    return d6;
  }

  public int getMaxHP() {
    return maxHP;
  }

  public void setMaxHP(int maxHP) {
    this.maxHP = maxHP;
  }

  public int getCurrentHP() {
    return currentHP;
  }

  public void setCurrentHP(int currentHP) {
    this.currentHP = currentHP;
  }

  public int getDP() {
    return DP;
  }

  public void setDP(int DP) {
    this.DP = DP;
  }

  public int getSP() {
    return SP;
  }

  public void setSP(int SP) {
    this.SP = SP;
  }

  public int getLvl() {
    return lvl;
  }

  public void setLvl(int lvl) {
    this.lvl = lvl;
  }
}
