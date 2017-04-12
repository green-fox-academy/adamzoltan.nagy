/**
 * Created by Adam on 2017. 04. 12..
 */
public class Hero extends Characters {

  public Hero () {
    super(0,0,"hero.png");
    setMaxHP(20 + 3 * rolld6());
    setCurrentHP(getMaxHP());
    setDP(2 * rolld6());
    setSP(5 + rolld6());
    setLvl(1);
  }
}
