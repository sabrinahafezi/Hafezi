package com.sabrina.module2.three;
import java.util.Comparator;

/**
 * Comparator class to sort cards based on their rank's value.
 * @author Sabrina
 */
public  class CardSortByRank implements Comparator<Card> {
    /**
     * Compare two cards based on their rank (value).
     * Order is the integer value of Card's rank.
     *
     * @param a A card.
     * @param b Another card.
     * @return  -1, 0, or 1 for less than, equal, or greater to the other.
     */
    @Override
    public int compare(Card a, Card b)
    {
        return(Integer.valueOf(a.rank.getValue()+"")).compareTo((Integer.valueOf(b.rank.getValue()+"")));
    }
}