package com.sabrina.module2.two;

public class Card {

    /**
     * Deck of card suites
     */
    public enum Suit {
        CLUBS, SPADES, HEARTS, DIAMONDS;

    }

    /**
     * Card ranks
     */
    public enum Rank {
        ACE(1, false),
        TWO(2, false),
        THREE(3, false),
        FOUR(4, false),
        FIVE(5, false),
        SIX(6, false),
        SEVEN(7, false),
        EIGHT(8, false),
        NINE(9, false),
        TEN(10, false),
        JACK(11, true),
        QUEEN(12, true),
        KING(13, true);

        /**
         * The value of the rank
         */
        private final int value;

        /**
         * Is the rank a face card?
         */
        private final boolean isFaceCard;

        /**
         * Enum constructor with options for value and face.
         * @param value
         * @param isFaceCard
         */
        Rank(int value, boolean isFaceCard) {
            this.value = value;
            this.isFaceCard = isFaceCard;
        }

        /**
         * Get the value of the card
         * @return Card value
         */
        public int getValue(){
            return(value);
        }

        /**
         * Is this a face card?
         * @return True if a face card, false otherwise.
         */
        public boolean isFaceCard(){
            return(isFaceCard);
        }

    }

    /**
     * A card's suit.
     */
    Suit suit;

    /**
     * A card's rank.
     */
    Rank rank;

    /**
     * Constructor
     *
     * @param suit Card's suit.
     * @param rank Card's rank.
     */
    public Card(Suit suit, Rank rank){
        this.suit = suit;
        this.rank = rank;

    }

    @Override
    public String toString(){
        return(rank + " of " + suit);
    }

}