/**
 * Created by Adam on 2017. 04. 21..
 */
public enum CardSuit { HEARTS, DIAMONDS, CLUBS, SPADES ;

  static int enumSize = CardSuit.values().length;

  static CardSuit getCardSuit(int i) {
    return CardSuit.values()[i];
  }
}
