/**
 * Created by Adam on 2017. 04. 11..
 */
public class Character {
  private int maxHP;
  private int currentHP;
  private int defendP;
  private int strikeP;
  private int lvl;

  public Character () {

  }

  public void setMaxHP(int maxHP) {
    this.maxHP = maxHP;
  }

  public void setCurrentHP(int currentHP) {
    this.currentHP = currentHP;
  }

  public void setDefendP(int defendP) {
    this.defendP = defendP;
  }

  public void setStrikeP(int strikeP) {
    this.strikeP = strikeP;
  }

  public void setLvl(int lvl) {
    this.lvl = lvl;
  }

  public int getMaxHP() {
    return maxHP;
  }

  public int getCurrentHP() {
    return currentHP;
  }

  public int getLvl() {
    return lvl;
  }

  public int d6 () {
    int dice6 = 1 + (int)(Math.random()*6);
    return dice6;
  }
}


