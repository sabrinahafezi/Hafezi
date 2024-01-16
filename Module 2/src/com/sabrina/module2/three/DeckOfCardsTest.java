package com.sabrina.module2.three;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author Sabrina
 */
public class DeckOfCardsTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String [] args) {

        //----------------------------------------------------------------------------------------
        // Create a deck of cards
        Deck deck1 = new Deck();
        LinkedList<Card> deckOfCards = deck1.getCards();
        int numberOfCardsToPull = 7;
        System.out.println("##############################################################");
        System.out.println("Started a new Deck of cards with " + deckOfCards.size() + " cards!");
        System.out.println("Randomly selecting " + numberOfCardsToPull + " cards (unsorted):");
        System.out.println("##############################################################");

        //----------------------------------------------------------------------------------------
        // Randomly pull out n cards, put them inside a separate list and print the unsorted cards.
        LinkedList<Card> selectedCards = new LinkedList<>();
        Random rand = new Random();
        for(int i = 0; i < numberOfCardsToPull; i++) {
            int randomIndex = rand.nextInt(deckOfCards.size());
            Card card = deckOfCards.get(randomIndex);
            System.out.println(
                    "---------------------------------------\n" +
                            "Card " + (i+1) + ": " + card + "\n" +
                            " Value: " + card.rank.getValue() + "\n" +
                            " Face Card: " + (card.rank.isFaceCard() ? "Yes" : "No")
            );
            selectedCards.add(card);
            deckOfCards.remove(randomIndex);
            System.out.println("The deck now has " + deckOfCards.size() + " cards left.\n");
        }

        //----------------------------------------------------------------------------------------
        // Sorting cards by rank/value
        System.out.println("##############################################################");
        System.out.println("Sorting the selected cards by Rank/Value:");
        System.out.println("##############################################################");
        Collections.sort(selectedCards, new CardSortByRank());
        for(int i = 0; i < selectedCards.size(); i++) {
            Card card = selectedCards.get(i);
            System.out.println(
                    "---------------------------------------\n" +
                            "Card " + (i+1) + ": " + card + "\n" +
                            " Value: " + card.rank.getValue() + "\n" +
                            " Face Card: " + (card.rank.isFaceCard() ? "Yes" : "No")
            );
        }
        System.out.println("\n");

        //----------------------------------------------------------------------------------------
        // Sorting cards by suit
        System.out.println("##############################################################");
        System.out.println("Sorting the selected cards by Suit:");
        System.out.println("##############################################################");
        Collections.sort(selectedCards, new CardSortBySuit());
        for(int i = 0; i < selectedCards.size(); i++) {
            Card card = selectedCards.get(i);
            System.out.println(
                    "---------------------------------------\n" +
                            "Card " + (i+1) + ": " + card + "\n" +
                            " Value: " + card.rank.getValue() + "\n" +
                            " Face Card: " + (card.rank.isFaceCard() ? "Yes" : "No")
            );
        }
        System.out.println("\n");


    }

}