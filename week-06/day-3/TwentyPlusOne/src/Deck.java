import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adam on 2017. 04. 19..
 */
public class Deck {
  private List<Card> deck;
  int deckSize;

  public Deck() {
    this.deck = new ArrayList<>();
    deckSize = 416;
  }

  public Card getCard( int i) {
    return this.deck.get(i);
  }

  public void fillDeck() {
    for (int j = 0; j < deckSize; j++) {
      for (int k = 0; k < CardSuit.enumSize; k++) {
        for (int l = 0; l < CardRank.enumSize; l++) {
          Card card = new Card(CardSuit.getCardSuit(k), CardRank.getCardRank(l));
          deck.add(card);
        }
      }
    }
  }

  public Card drawTop() {
    Card card = deck.remove(deckSize-1);
    deckSize = deckSize - 1;
    return card;
  }

  public Card drawBottom() {
    Card card = deck.remove(0);
    deckSize = deckSize - 1;
    return card;
  }

  public Card drawRandom() {
    Card card = deck.remove((int)(Math.random()*deckSize));
    deckSize = deckSize - 1;
    return card;
  }

}
