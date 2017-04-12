import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Adam on 2017. 04. 12..
 */
public class GameEngine extends JComponent implements KeyListener {
  private GameMap gameMap;
  Hero myHero = new Hero();

  public GameEngine() {
    this.gameMap = new GameMap();

    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    gameMap.fillTileList();
    for (Tile temp : gameMap.getTileList()) {
      PositionedImage tiles = new PositionedImage( temp.getPosX() * 72, temp.getPosY() * 72,temp.getPicture());
      tiles.draw(graphics);
    }

    PositionedImage hero = new PositionedImage(myHero.getPosX(),myHero.getPosY(),myHero.getPicture());
    hero.draw(graphics);
  }

  // To be a KeyListener the class needs to have these 3 methods in it
  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  // But actually we can use just this one for our goals here
  @Override
  public void keyReleased(KeyEvent e) {
    // When the up or down keys hit, we change the position of our box
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      myHero.moveUp();
    } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
      myHero.moveDown();
    } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
      myHero.moveLeft();
    } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
      myHero.moveRight();
    }
    // and redraw to have a new picture with the new coordinates
    repaint();
  }
}
