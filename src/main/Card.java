import enums.*;

public class Card {

    private Suit suit;
    private int rank;
    
    public Card(Suit suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public int getRank() {
        return this.rank;
    }

    @Override
    public String toString() {
        return "Test Card.toString()";
    }

}