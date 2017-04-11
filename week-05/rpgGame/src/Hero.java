/**
 * Created by Adam on 2017. 04. 11..
 */
public class Hero extends Character {

  public Hero() {
    setMaxHP(20 + 3 * d6());
    setCurrentHP(getMaxHP());
    setDefendP(2 * d6());
    setStrikeP(5 + d6());
    setLvl(1);
  }
}
