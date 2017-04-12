import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;
import java.util.List;


public class GameEngine extends JComponent implements KeyListener {

  Graphics graphics;
  int heroBoxX;
  int heroBoxY;
  int skeleMove = 0;
  List<Integer> availableX;
  List<Integer> availableY;
  String skeletonName = "skeleton.png";
  String heroPic = "hero-down.png";
  String floor = "floor.png";
  String wall = "wall.png";


  public GameEngine() {
    heroBoxX = 0;
    heroBoxY = 0;

    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);

    availableX = new ArrayList<>();
    availableY = new ArrayList<>();
//    Monster monster = new Monster(graphics);
    GameMap map = new GameMap();
    PositionedImage hero = new PositionedImage(heroPic, heroBoxX, heroBoxY);
    PositionedImage skeleton = new PositionedImage(skeletonName, 0, 0);
    PositionedImage floorTile = new PositionedImage(floor, 0, 0);
    PositionedImage wallTile = new PositionedImage(wall, 0, 0);

    for (Tile temp : map.tileList) {
      PositionedImage tiles = new PositionedImage(temp.picture, temp.getPosX() * 72, temp.getPosY() * 72);
      tiles.draw(graphics);
    }
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

    } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {

    }
    // and redraw to have a new picture with the new coordinates
    repaint();
  }
}
