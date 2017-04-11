/**
 * Created by Adam on 2017. 04. 11..
 */
public class Skeleton extends Character {

  public Skeleton () {
    setMaxHP(2 * d6() + d6());
    setCurrentHP(getMaxHP());
    setDefendP(d6() + d6() / 2);
    setStrikeP(d6() + getLvl());
    setLvl(1);
  }
}
