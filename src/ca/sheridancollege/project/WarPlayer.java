package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * This is the Player class
 * It contains knowledge about its name, number of cards, cards it has and
 * cards it has played.
 */
public class WarPlayer extends Player {
    // The deck of cards the player currently has.
    private ArrayList<DeckOfCards> myHand = new ArrayList<>();
    // The deck of cards the player has played.
    private ArrayList<DeckOfCards> playedCard = new ArrayList<>();
    
    

    /**
     * The username of the player.
     * @param name
     */
    public WarPlayer(String name){
        super(name);
    }
    
    /**
     * Game ends if hand is Empty, otherwise remove the top card from this deck
     * and add it into played cards and print out the card to the screen.
     * @return false will end the game, true will continue the game.
     */
    @Override
    public boolean play(){
           if (myHand.isEmpty()){
               return false;
           }
           else {
               System.out.println(super.getPlayerID() + " Plays:");
               System.out.println(myHand.get(0).toString());
               setPlayedCard(myHand.get(0));
               myHand.remove(0);
               return true;
           }
    }
    
    /**
     * Used mainly to determine the results of the game.
     * @return number of cards in this Deck.
     */
    public int CardsInDeck(){
        return myHand.size();
    }

    /**
     * @return the myHand
     */
    public ArrayList<DeckOfCards> getMyHand() {
        return myHand;
    }

    /**
     * @param myHand the myHand to set
     */
    public void setMyHand(ArrayList<DeckOfCards> myHand) {
        this.myHand = myHand;
    }

    /**
     * @return the playedCard
     */
    public ArrayList<DeckOfCards> getPlayedCard() {
        return playedCard;
    }

    /**
     * @param playedCard the playedCard to set
     */
    public void setPlayedCard(DeckOfCards playedCard) {
        this.playedCard.add(playedCard);
    }
    
    
}
