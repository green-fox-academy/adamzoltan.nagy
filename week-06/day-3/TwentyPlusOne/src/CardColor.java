/**
 * Created by Adam on 2017. 04. 21..
 */
public enum CardColor { RED, BLCACK;

  static int enumSize = CardColor.values().length;

  static CardColor getColor() {
    return CardColor.values()[0];
  }
}
