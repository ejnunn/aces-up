public class Card {

    private enum Suit {
        HEART, DIAMOND, CLUB, SPADE;
    }

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

}