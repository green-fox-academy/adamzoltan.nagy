import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenteredBoxes {

  public static void mainDraw(Graphics graphics){
    // create a square drawing function that takes 1 parameter:
    // the square size
    // and draws a square of that size to the center of the canvas.
    // draw 3 squares with that function.
    graphics.setColor(Color.black);
    graphics.drawRect(0,0,300,300);

    drawCenteredBox(graphics,100);
    drawCenteredBox(graphics,150);
    drawCenteredBox(graphics,50);
  }

  public static void drawCenteredBox (Graphics graphics, int x) {
    graphics.setColor(Color.green);
    graphics.drawRect(150-(x/2),150-(x/2),x,x);
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
