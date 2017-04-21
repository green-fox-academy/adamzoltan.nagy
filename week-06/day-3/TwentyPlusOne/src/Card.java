/**
 * Created by Adam on 2017. 04. 19..
 */
public class Card {
  CardColor color;
  CardSuit suit;
  CardRank rank;

  public Card(CardColor color, CardSuit suit, CardRank rank) {
    this.color = color;
    this.suit = suit;
    this.rank = rank;
  }

  public CardColor getColor() {
    return color;
  }

  public void setColor(CardColor color) {
    this.color = color;
  }

  public CardSuit getSuit() {
    return suit;
  }

  public void setSuit(CardSuit suit) {
    this.suit = suit;
  }

  public CardRank getRank() {
    return rank;
  }

  public void setRank(CardRank rank) {
    this.rank = rank;
  }
}
