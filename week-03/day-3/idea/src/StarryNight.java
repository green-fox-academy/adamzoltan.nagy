import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {

  public static void mainDraw(Graphics graphics){
    // draw the night sky:
    // - The background should be black
    // - The stars can be small squares
    // - The stars should have random positions on the canvas
    // - The stars should have random color (some shade of grey)

    graphics.setColor(Color.black);
    graphics.fillRect(0,0,300,300);


    for ( int i = 0; i < 35; i++) {
      int color = 50 + (int)(Math.random()*170);
      int starX =  10 + (int)(Math.random()*280);
      int starY =  10 + (int)(Math.random()*280);
      graphics.setColor(new Color(color,color,color));
      graphics.fillRect(starX,starY,5,5);
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
