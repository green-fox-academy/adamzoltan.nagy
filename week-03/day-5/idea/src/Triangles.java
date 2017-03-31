import sun.java2d.windows.GDIRenderer;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {

  public static void mainDraw(Graphics graphics){
    int posX = 10;
    int posY = 10;
    int width = 320;
    int height = 287;
    int recursion = 5;

    triangles(graphics, posX, posY, width, height, recursion );
  }
  public static void triangles (Graphics graphics, int x, int y, int w, int h, int r ) {
    int [] pointX = {x, x + w, x + w / 2};
    int [] pointY = {y, y, y + h};
    graphics.drawPolygon(pointX, pointY, 3);
    if (r > 0) {
      graphics.setColor(Color.red);
      triangles(graphics, x, y, w / 2, h / 2, r - 1);
      graphics.setColor(Color.green);
      triangles(graphics, x + w / 2, y, w / 2, h / 2, r - 1);
      graphics.setColor(Color.blue);
      triangles(graphics, x + w / 4, y + h / 2, w / 2, h / 2, r - 1);
    }
  }



  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(600, 600));
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
