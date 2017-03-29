import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EverythingGoesToCenter{

  public static void mainDraw(Graphics graphics){
    // create a line drawing function that takes 2 parameters:
    // the x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // fill the canvas with lines from the edges, every 20 px, to the center.

    graphics.setColor(Color.black);
    graphics.drawRect(0,0,300,300);

    graphics.setColor(Color.blue);
    for (int i = 0; i <= 300; i += 20) {
      graphics.drawLine(0, 0 + i, 150, 150);
      graphics.drawLine(300, 300 - i, 150, 150);
      graphics.drawLine(0 + i, 0, 150, 150);
      graphics.drawLine(300 - i, 300, 150, 150);
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
