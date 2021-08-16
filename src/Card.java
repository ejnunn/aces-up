public class Card {

    private enum Suit {
        HEART, DIAMOND, CLUB, SPADE;
    }

    private enum Rank {
        _1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13;
    }

    private Suit suit;
    private Rank rank;
    
    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public Rank getRank() {
        return this.rank;
    }

}