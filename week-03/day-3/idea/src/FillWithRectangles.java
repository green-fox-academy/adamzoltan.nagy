import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FillWithRectangles {

  public static void mainDraw(Graphics graphics){
    graphics.setColor(Color.blue);
    graphics.fillRect(10,10,50,50);
    graphics.setColor(Color.green);
    graphics.fillRect(80,10,70,70);
    graphics.setColor(Color.red);
    graphics.fillRect(10,80,60,60);
    graphics.setColor(Color.yellow);
    graphics.fillRect(110,100,40,40);
    // draw four different size and color rectangles.



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
