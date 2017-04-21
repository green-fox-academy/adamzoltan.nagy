/**
 * Created by Adam on 2017. 04. 21..
 */
public enum CardRank { TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, J, Q, K, A;

  static int enumSize = CardRank.values().length;

  static CardRank getCardSuit() {
    return CardRank.values()[0];
  }

}
