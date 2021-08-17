import enums.*;
import java.util.ArrayList;

public class Deck {
    ArrayList<Card> deckOfCards;
    int TOTALCARDSPERSUIT = 13;
    int TOTALSUITS = 4;

    public Deck(){
        this.deckOfCards = new ArrayList<Card>();
        generateDeck();
        shuffleDeck();
    }

    private void generateDeck() {
        for (Suit s : Suit.values()){
            for (int i = 0; i < TOTALCARDSPERSUIT; i ++){
                Card tempCard = new Card (s, i + 1);
                deckOfCards.add(tempCard);
            }
        }
    }

    private void shuffleDeck() {
    }

    

}
