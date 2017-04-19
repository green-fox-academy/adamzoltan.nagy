/**
 * Created by Adam on 2017. 04. 19..
 */
public enum Colors {
  RED, BLUE, GREEN, YELLOW, BLACK, WHITE;

  static int enumSize = Colors.values().length;

  static Colors getColor() {
    return Colors.values()[(int)(Math.random()*enumSize)];
  }
}
