/**
 * Created by Adam on 2017. 04. 12..
 */
public class Hero extends Characters{
  public Hero () {
    super(0, 0, "hero-down.png");
    setMaxHP(20 + 3 * rolld6());
    setCurrentHP(getMaxHP());
    setDP(2 * rolld6());
    setSP(5 + rolld6());
    setLvl(1);
  }

  @Override
  public void moveUp() {
    super.moveUp();
    setPicture("hero-up.png");
  }

  @Override
  public void moveDown() {
    super.moveDown();
    setPicture("hero-down.png");
  }

  @Override
  public void moveLeft() {
    super.moveLeft();
    setPicture("hero-left.png");
  }

  @Override
  public void moveRight() {
    super.moveRight();
    setPicture("hero-right.png");
  }
}
