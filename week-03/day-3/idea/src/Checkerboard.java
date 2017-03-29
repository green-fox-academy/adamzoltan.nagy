import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {

  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.black);
    graphics.drawRect(0, 0, 300, 300);
    for (int i = 0; i < 30; i++) {
      if (i % 2 == 0) {
        for (int j = 0; j < 30; j += 2) {
          graphics.fillRect(j * 10, i * 10, 10, 10);
        }
      } else {
        for (int j = 1; j < 30; j += 2) {
          graphics.fillRect(j * 10, i * 10, 10, 10);
        }
      }
    }
  }

      // fill the canvas with a checkerboard pattern.




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
