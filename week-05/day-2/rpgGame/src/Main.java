import javax.swing.*;

public class Main {
  public static void main(String[] args) {
    JFrame frame = new JFrame("RPG Game");
    GameEngine board = new GameEngine();
    frame.add(board);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
    frame.addKeyListener(board);
  }
}
