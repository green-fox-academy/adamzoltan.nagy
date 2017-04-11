import javax.swing.*;
import java.awt.*;
import java.awt.List;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Array;
import java.util.*;

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
  int [][] roadWalls = {
          {0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
          {0, 0, 0, 1, 0, 1, 0, 1, 1, 0},
          {0, 1, 1, 1, 0, 1, 0, 1, 1, 0},
          {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
          {1, 1, 1, 1, 0, 1, 1, 1, 1, 0},
          {0, 1, 0, 1, 0, 0, 0, 0, 1, 0},
          {0, 1, 0, 1, 0, 1, 1, 0, 1, 0},
          {0, 0, 0, 0, 0, 1, 1, 0, 1, 0},
          {0, 1, 1, 1, 0, 0, 0, 0, 1, 0},
          {0, 0, 0, 1, 0, 1, 1, 0, 0, 0},
  };
  @Override
  public void paint(Graphics graphics) {

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
    PositionedImage image = new PositionedImage(hero, testBoxX, testBoxY);
    image.draw(graphics);
  }



  public int currentPos(int x) {
    int currPos = x / 72;
    return currPos;
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
      if (testBoxY == 0 || (roadWalls [currentPos(testBoxY - 1)][currentPos(testBoxX)] == 1)){
      } else {
        testBoxY -= 72;
      }
      hero = "hero-up.png";
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      if (testBoxY == 648 || (roadWalls [currentPos(testBoxY ) + 1][currentPos(testBoxX)] == 1)) {
      } else {
        testBoxY += 72;
      }
      hero = "hero-down.png";
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      if (testBoxX == 0 || (roadWalls [currentPos(testBoxY)][currentPos(testBoxX - 1 )] == 1)) {
      } else {
        testBoxX -= 72;
      }
      hero = "hero-left.png";
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      if (testBoxX == 648 || (roadWalls [currentPos(testBoxY)][currentPos(testBoxX) + 1] == 1)) {
      } else {
        testBoxX += 72;
      }
      hero = "hero-right.png";
    }
    // and redraw to have a new picture with the new coordinates
    repaint();
  }
}
