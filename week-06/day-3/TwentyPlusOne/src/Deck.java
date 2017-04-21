import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adam on 2017. 04. 19..
 */
public class Deck {
  private List<Card> deck;
  int decksize;

  public Deck() {
    this.deck = new ArrayList<>();
    decksize = 416;
  }
}
