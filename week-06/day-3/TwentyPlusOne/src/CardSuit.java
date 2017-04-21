/**
 * Created by Adam on 2017. 04. 21..
 */
public enum CardSuit { CLUBS, DIAMONDS, HEARTS, SPADES;

  static int enumSize = CardSuit.values().length;

  static CardSuit getCardSuit() {
    return CardSuit.values()[0];
  }
}
