import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {

  public static void mainDraw(Graphics graphics){
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/line-play/r1.png]

    graphics.setColor(Color.black);
    graphics.drawRect(0,0,300,300);

    for (int i = 0; i < 300; i += 20) {
      graphics.setColor(Color.green);
      graphics.drawLine(0 + i / 100,0 + i, 20 + i,300);
      graphics.setColor(Color.blue);
      graphics.drawLine(300-i / 100,300-i, 280-i,0);
      graphics.setColor(Color.red);
      graphics.drawLine(300 - i, 0 + i / 100,0, 20+i);
      graphics.setColor(Color.MAGENTA);
      graphics.drawLine(0 + i,300 - i / 100,300,280-i);
    }
  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 300));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}