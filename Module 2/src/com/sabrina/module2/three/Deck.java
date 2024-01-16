package com.sabrina.module2.three;
import java.util.LinkedList;

/**
 *
 * @author Sabrina
 */
public class Deck {

    /**
     * A deck of cards array
     */
    private LinkedList<Card> cards;

    /**
     * Constructor
     */
    public Deck() {
        cards = new LinkedList<>();
        fill();

    }

    /**
     *
     * @return Cards
     */
    public LinkedList getCards(){
        return(cards);
    }

    /**
     *
     * @param cards
     */
    public void setCards(LinkedList cards) {
        this.cards = cards;
    }

    /**
     * Populate the deck with a complete set of cards.
     */
    public void fill() {
        for(Card.Suit s : Card.Suit.values()) {
            for(Card.Rank r : Card.Rank.values()) {
                cards.push(new Card(s, r));
            }
        }
    }


}