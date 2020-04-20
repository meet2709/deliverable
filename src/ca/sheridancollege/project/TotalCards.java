package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * This class is used to auto generate a full deck of 52 playing cards.
 */
public class TotalCards extends CardGroup {
    // To store the suits of each card.
    private ArrayList<String> suits = new ArrayList<>();
    // To store the individual cards.
    private ArrayList<DeckOfCards> cards = new ArrayList<>();
    
    /**
     * Once this class is instantiated it will create a full deck of 52 
     * playing cards using suits: "Hearts", "Spades", "Diamonds" and "Clubs".
     */
    public TotalCards(){
        // Set the size of the deck.
        super(52);   
        // Set the suits of the deck.
        suits.add("Hearts");
        suits.add("Spades");
        suits.add("Diamonds");
        suits.add("Clubs");
        // Create the cards of the deck.
        createCards();
    }
    
    // Private method only used for TotalCards() to create a full deck of 52 cards.
    private void createCards(){
        
        for (String suit : this.getSuits()){
            for (int i = 2; i < 15; i++){
                this.setCards(new DeckOfCards(i, suit));
            }
            
        }
               
}

    /**
     * This shuffles the cards in the ArrayList<DeckOfCards>.
     */
    @Override
    public void shuffle(){
        Collections.shuffle(cards);        
    }
     

    /**
     * @return the suits
     */
    public ArrayList<String> getSuits() {
        return suits;
    }

    /**
     * @param suits the suits to set
     */
    public void setSuits(ArrayList<String> suits) {
        this.suits = suits;
    }

    /**
     * @return the cards
     */
    public ArrayList<DeckOfCards> getCards() {
        return cards;
    }

    /**
     * @param cards the cards to set
     */
    public void setCards(DeckOfCards cards) {
        this.cards.add(cards);
    }
}
