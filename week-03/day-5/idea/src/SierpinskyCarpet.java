import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyCarpet {

  public static void mainDraw(Graphics graphics){

    int x = 0;
    int y = 0;
    int size = 600;

    graphics.setColor(Color.white);
    graphics.fillRect(x,y,size,size);
    graphics.setColor(Color.black);

    carpet(graphics,200,200,200, 5);
  }

  public static void carpet(Graphics graphics, int x, int y, int s, int counter) {
    graphics.fillRect(x,y,s,s);
    if (counter > 0) {
      carpet(graphics,x+3*s/9,y-3*s/9*2,s/3, counter - 1);
      carpet(graphics,x+3*s/9*4,y+3*s/9,s/3, counter - 1);
      carpet(graphics,x+3*s/9,y+3*s/9*4,s/3, counter - 1);
      carpet(graphics,x-3*s/9*2,y+3*s/9,s/3, counter - 1);
      carpet(graphics,x-3*s/9*2,y-3*s/9*2,s/3, counter - 1);
      carpet(graphics,x+3*s/9*4,y-3*s/9*2,s/3, counter - 1);
      carpet(graphics,x+3*s/9*4,y+3*s/9*4,s/3, counter - 1);
      carpet(graphics,x-3*s/9*2,y+3*s/9*4,s/3, counter - 1);
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
