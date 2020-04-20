
package ca.sheridancollege.project;
/**
 * This class is used to compare cards between two WarPlayers.
 */
public class Cardcomparison {
    // Used to store each WarPlayers card value.
    private int playerCard;
    private int computerCard;
    
    /**
     *Empty Constructor 
     */
    public Cardcomparison(){}
    
    /**
     * This Compares the cards of WarPlayers.
     * 
     * @param player1 The Human Player
     * @param player2 The Computer
     * @return false if a player has no more cards, else keep comparing cards.
     */
    public boolean Compare(WarPlayer player1, WarPlayer player2){
        // This is the getPlayedCard Array index.
        int count = 0;
        
        // While there are cards on the table.        
        while (!player1.getPlayedCard().isEmpty()){
        playerCard = player1.getPlayedCard().get(count).getValue();
        computerCard = player2.getPlayedCard().get(count).getValue();
        // If Human wins
        if (playerCard > computerCard){
            System.out.println(player1.getPlayerID() + " wins the hand!");
            // Add Computer and Human cards to bottom of the deck
            player1.getMyHand().add(player1.getPlayedCard().get(count));
            player1.getMyHand().add(player2.getPlayedCard().get(count));
            // And remove the cards that were just played.
            player1.getPlayedCard().remove(count);
            player2.getPlayedCard().remove(count);
            // If there are cards still on the table add the rest to the Humans Hand.
            while (!player1.getPlayedCard().isEmpty()){
                count--;
                player1.getMyHand().add(player1.getPlayedCard().get(count));
                player1.getMyHand().add(player2.getPlayedCard().get(count));
                player1.getPlayedCard().remove(count);
                player2.getPlayedCard().remove(count);
                
            }
        }
        // If Computer wins, do the same thing as Humans
        else if (playerCard < computerCard){
            System.out.println(player2.getPlayerID() + " wins the hand!");
            player2.getMyHand().add(player1.getPlayedCard().get(count));
            player2.getMyHand().add(player2.getPlayedCard().get(count));
            player1.getPlayedCard().remove(count);
            player2.getPlayedCard().remove(count);
            while (!player1.getPlayedCard().isEmpty()){
                count--;
                player1.getMyHand().add(player1.getPlayedCard().get(count));
                player1.getMyHand().add(player2.getPlayedCard().get(count));
                player1.getPlayedCard().remove(count);
                player2.getPlayedCard().remove(count);
                
            }
        }
        // Both Human And Computer have the same Card.
        else {
            System.out.println("Its time for War!");
            // Keep Playing until either the deck runs out or one player wins.
            if (player1.play() && player2.play()){
                count++;
            }
            else {
                return false;
            }
             
        }
         
        }
        // All cards have been played, end of a round.
        return true;
     }

    /**
     * @return the playerCard
     */
    public int getPlayerCard() {
        return playerCard;
    }

    /**
     * @param playerCard the playerCard to set
     */
    public void setPlayerCard(int playerCard) {
        this.playerCard = playerCard;
    }

    /**
     * @return the computerCard
     */
    public int getComputerCard() {
        return computerCard;
    }

    /**
     * @param computerCard the computerCard to set
     */
    public void setComputerCard(int computerCard) {
        this.computerCard = computerCard;
    }
    
}
