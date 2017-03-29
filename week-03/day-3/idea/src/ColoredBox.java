import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {

  public static void mainDraw(Graphics graphics){

    graphics.setColor(Color.blue);
    graphics.drawLine(10,10,210,10);
    graphics.setColor(Color.green);
    graphics.drawLine(210,10,210,210);
    graphics.setColor(Color.red);
    graphics.drawLine(10,210,210,210);
    graphics.setColor(Color.yellow);
    graphics.drawLine(10,10,10,210);
    // draw a box that has different colored lines on each edge.



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