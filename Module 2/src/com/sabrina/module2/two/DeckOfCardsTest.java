package com.sabrina.module2.two;

import java.util.LinkedList;
import java.util.Random;

public class DeckOfCardsTest {



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create a deck of cards
        Deck deck1 = new Deck();
        LinkedList<Card> deckOfCards = deck1.getCards();

        System.out.println("The deck has " + deckOfCards.size() + " cards");


        // Randomly pull out 7 cards and remove the previously pulled card from the list (to avoid repeated cards):
        Random rand = new Random();
        for(int i = 0; i < 7; i++) {
            int randomEntry = rand.nextInt(deckOfCards.size());
            Card card = deckOfCards.get(randomEntry);
            deckOfCards.remove(randomEntry);
            System.out.println("Card " + (i+1) + ": " + card + "\n" + " Value: " + card.rank.getValue() + "\n" + " Face Card: " + (card.rank.isFaceCard() ? "Yes" : "No") + "\n");
        }

    }


}