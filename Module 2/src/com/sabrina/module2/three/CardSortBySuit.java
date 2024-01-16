package com.sabrina.module2.three;

import java.util.Comparator;

/**
 * Comparator class to sort cards based on their Suit.
 *
 * Order is: SPADES, HEARTS, CLUBS, DIAMONDS.
 *
 * @author Sabrina
 */
public class CardSortBySuit implements Comparator<Card> {
    /**
     * Compare two cards based on their suite.
     * Order is: SPADES, HEARTS, CLUBS, DIAMONDS.
     *
     * @param a A card.
     * @param b Another card.
     * @return  -1, 0, or 1 for less than, equal, or greater to the other.
     */
    @Override
    public int compare(Card a, Card b)
    {
        return(getSuiteValue(a.suit).compareTo(getSuiteValue(b.suit)));
    }

    /**
     * Return a numerical int value for the give card suite.
     * 1->SPADES, 2->HEARTS, 3->CLUBS, 4->DIAMONDS.
     *
     * @param s A Suit.
     */
    private Integer getSuiteValue(Card.Suit s) {
        switch(s) {
            case SPADES: return(1);
            case HEARTS: return(2);
            case CLUBS: return(3);
            case DIAMONDS: return(4);
            default: return(-1);
        }
    }
}