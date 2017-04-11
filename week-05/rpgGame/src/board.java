import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class Board extends JComponent implements KeyListener {

  int testBoxX;
  int testBoxY;

  public Board() {
    testBoxX = 0;
    testBoxY = 0;

    // set the size of your draw board
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
  }

  String hero = "hero-down.png";

  @Override
  public void paint(Graphics graphics) {
    int[][] roadWalls = {
            {0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 1, 0, 1, 1, 0},
            {0, 1, 1, 1, 0, 1, 0, 1, 1, 0},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
            {1, 1, 1, 1, 0, 1, 1, 1, 1, 0},
            {0, 1, 0, 1, 0, 0, 0, 0, 1, 0},
            {0, 1, 0, 1, 0, 1, 1, 0, 1, 0},
            {0, 0, 0, 0, 0, 1, 1, 0, 1, 0},
            {0, 1, 1, 1, 0, 0, 0, 0, 1, 0},
            {0, 0, 0, 1, 0, 1, 1, 0, 1, 0},
    };
    super.paint(graphics);
    // here you have a 720x720 canvas
    // you can create and draw an image using the class below e.g.
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (roadWalls[i][j] == 0) {
          PositionedImage image = new PositionedImage("floor.png", j * 72, i * 72);
          image.draw(graphics);
        } else {
          PositionedImage image = new PositionedImage("wall.png", j * 72, i * 72);
          image.draw(graphics);
        }
      }
    }
    //graphics.fillRect(testBoxX, testBoxY, 72, 72);
    PositionedImage image = new PositionedImage(hero, testBoxX, testBoxY);
    image.draw(graphics);
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
      if (testBoxY == 0) {
        testBoxY = testBoxY;
      } else {
        testBoxY -= 72;
      }
      hero = "hero-up.png";
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      if (testBoxY == 648) {
        testBoxY = testBoxY;
      } else {
        testBoxY += 72;
      }
      hero = "hero-down.png";
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      if (testBoxX == 0) {
        testBoxX = testBoxX;
      } else {
        testBoxX -= 72;
      }
      hero = "hero-left.png";
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      if (testBoxX == 648) {
        testBoxX = testBoxX;
      } else {
        testBoxX += 72;
      }
      hero = "hero-right.png";
    }
    // and redraw to have a new picture with the new coordinates
    repaint();
  }
}
