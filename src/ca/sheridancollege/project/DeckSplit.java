package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * Helper class to split a 52 card deck into equal parts.
 */
public class DeckSplit {
    // Store the first half, or the human cards.
    private ArrayList<DeckOfCards> userCards = new ArrayList<>();
    // Store the second half, or the computer cards.
    private ArrayList<DeckOfCards> computerCards = new ArrayList<>();
    
    /**
     * The Cards must be of size 52 or this will create an error.
     *  Cards Takes in an ArrayList<DeckOfCards> to be split.
     */
    public DeckSplit(ArrayList<DeckOfCards> Cards){
        for (int i = 0; i < 26; i++){
            userCards.add(Cards.get(i));
        }
        for (int j = 26; j < 52; j++){
            computerCards.add(Cards.get(j));
        }
        
    }

    /**
     * @return the userCards
     */
    public ArrayList<DeckOfCards> getUserCards() {
        return userCards;
    }

    /**
     * @param userCards the userCards to set
     */
    public void setUserCards(ArrayList<DeckOfCards> userCards) {
        this.userCards = userCards;
    }

    /**
     * @return the computerCards
     */
    public ArrayList<DeckOfCards> getComputerCards() {
        return computerCards;
    }

    /**
     * @param computerCards the computerCards to set
     */
    public void setComputerCards(ArrayList<DeckOfCards> computerCards) {
        this.computerCards = computerCards;
    }
    
}
