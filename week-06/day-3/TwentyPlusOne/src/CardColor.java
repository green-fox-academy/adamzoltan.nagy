/**
 * Created by Adam on 2017. 04. 21..
 */
public enum CardColor { RED, BLACK;

  static int enumSize = CardColor.values().length;

  static CardColor getColor(int n) {
    return CardColor.values()[n];
  }
}
