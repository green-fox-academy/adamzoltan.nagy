/**
 * Created by Adam on 2017. 04. 19..
 */
public class Game {
  public static void main(String[] args) {
    Deck myDeck = new Deck();
    myDeck.fillDeck();


    for (int i = 0; i < myDeck.decksize; i++) {
      System.out.println(myDeck.getCard(i));

    }
  }
}
