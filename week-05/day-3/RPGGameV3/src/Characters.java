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

  public  Characters() {
  }

  public void move(int x, int y) {
    setPosX(getPosX() + x);
    setPosY(getPosY() + y);
  }

  public void moveUp () {
    if ((GameMap.wallMatrix[getPosY() / 72 - 1][getPosX() / 72 ] == 0) && (getPosY() != 0)) {
      move(0, -72);
    }
  }

  public void moveDown () {
    if ((GameMap.wallMatrix[getPosY() / 72 + 1][getPosX() / 72 ] == 0) && (getPosY() != 648)) {
      move(0, +72);
    }
  }

  public void moveLeft () {
    if ((GameMap.wallMatrix[getPosY() / 72 ][getPosX() / 72 - 1 ] == 0) && (getPosX() != 0)) {
      move(-72, 0);
    }
  }

  public void moveRight () {
    if ((GameMap.wallMatrix[getPosY() / 72 ][getPosX() / 72 + 1 ] == 0) && (getPosX() != 648)) {
      move(+72, 0);
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
