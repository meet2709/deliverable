package ca.sheridancollege.project;

/**
 * This is using Factory design pattern, by creating a class that models
 * every single card in a normal set of 52 playing cards.
 * ascii art by: https://www.asciiart.eu/miscellaneous/playing-cards
 */
public class DeckOfCards extends Card{
    // The number of the playing card, which determines its value. 2 being the lowest and Ace being the highest at 14.
    private int value;
    // The suit of the player card.
    private String type;
    
    /**
     * Create a card that can be any type from a normal set of 52 playing cards.
     * @param num The number of the playing card.
     * @param type The suit of the playing card.
     */
    public DeckOfCards(int num, String type){
        this.value = num;
        this.type = type;
    }
    
     /**
     * Returns the string representation from https://www.asciiart.eu/miscellaneous/playing-cards
     * based on its suit and number.
     * @return The String representation of a playing card.
     */
    @Override
    public String toString(){
        if (this.getType().equals("Hearts")){
            switch(this.getValue()){
                
                case 14: return " _____\n|A_ _ |\n|( v )|\n| \\ / |\n|  .  |\n|____A|\n";
                case 2: return " _____\n|2    |\n|  v  |\n|     |\n|  v  |\n|____2|\n";
                case 3: return " _____ \n|3    |\n| v v |\n|     |\n|  v  |\n|____3|\n";
                case 4: return " _____ \n|4    |\n| v v |\n|     |\n| v v |\n|____4|\n";
                case 5: return " _____ \n|5    |\n| v v |\n|  v  |\n| v v |\n|____5|\n";
                case 6: return " _____ \n|6    |\n| v v |\n| v v |\n| v v |\n|____6|\n";
                case 7: return " _____ \n|7    |\n| v v |\n|v v v|\n| v v |\n|____7|\n";
                case 8: return " _____ \n|8    |\n|v v v|\n| v v |\n|v v v|\n|____8|\n";
                case 9: return " _____ \n|9    |\n|v v v|\n|v v v|\n|v v v|\n|____9|\n";
                case 10: return " _____ \n|10 v |\n|v v v|\n|v v v|\n|v v v|\n|____10|\n";
                case 11: return " _____ \n|J  ww|\n|   {)|\n|(v)% |\n| v % |\n|__%%J|\n";
                case 12: return " _____ \n|Q  ww|\n|   {(|\n|(v)%%|\n| v%%%|\n|_%%%Q|\n";
                case 13: return " _____ \n|K  WW|\n|   {)|\n|(v)%%|\n| v%%%|\n|_%%%K|\n";
                default: return "Wrong value.";
           
        }
        }
        else if (this.getType().equals("Spades")){
            switch(this.getValue()){
                case 14: return " _____\n|A .  |\n| /.\\ |\n|(_._)|\n|  |  |\n|____A|\n";
                case 2: return " _____\n|2    |\n|  ^  |\n|     |\n|  ^  |\n|____2|\n";
                case 3: return " _____ \n|3    |\n| ^ ^ |\n|     |\n|  ^  |\n|____3|\n";
                case 4: return " _____ \n|4    |\n| ^ ^ |\n|     |\n| ^ ^ |\n|____4|\n";
                case 5: return " _____ \n|5    |\n| ^ ^ |\n|  ^  |\n| ^ ^ |\n|____5|\n";
                case 6: return " _____ \n|6    |\n| ^ ^ |\n| ^ ^ |\n| ^ ^ |\n|____6|\n";
                case 7: return " _____ \n|7    |\n| ^ ^ |\n|^ ^ ^|\n| ^ ^ |\n|____7|\n";
                case 8: return " _____ \n|8    |\n|^ ^ ^|\n| ^ ^ |\n|^ ^ ^|\n|____8|\n";
                case 9: return " _____ \n|9    |\n|^ ^ ^|\n|^ ^ ^|\n|^ ^ ^|\n|____9|\n";
                case 10: return " _____ \n|10 ^ |\n|^ ^ ^|\n|^ ^ ^|\n|^ ^ ^|\n|____10|\n";
                case 11: return " _____ \n|J  ww|\n| ^ {)|\n||(.)%|\n| | % |\n|__%%J|\n";
                case 12: return " _____ \n|Q  ww|\n| ^ {(|\n|(.)%%|\n| |%%%|\n|_%%%Q|\n";
                case 13: return " _____ \n|K  WW|\n| ^ {)|\n|(.)%%|\n| |%%%|\n|_%%%K|\n";
                default: return "Wrong value.";
            }
        }
         else if (this.getType().equals("Clubs")){
            switch(this.getValue()){
                case 14: return " _____\n|A _  |\n| ( ) |\n|(_'_)|\n|  |  |\n|____A|\n";
                case 2: return " _____\n|2    |\n|  &  |\n|     |\n|  &  |\n|____2|\n";
                case 3: return " _____ \n|3    |\n| & & |\n|     |\n|  &  |\n|____3|\n";
                case 4: return " _____ \n|4    |\n| & & |\n|     |\n| & & |\n|____4|\n";
                case 5: return " _____ \n|5    |\n| & & |\n|  &  |\n| & & |\n|____5|\n";
                case 6: return " _____ \n|6    |\n| & & |\n| & & |\n| & & |\n|____6|\n";
                case 7: return " _____ \n|7    |\n| & & |\n|& & &|\n| & & |\n|____7|\n";
                case 8: return " _____ \n|8    |\n|& & &|\n| & & |\n|& & &|\n|____8|\n";
                case 9: return " _____ \n|9    |\n|& & &|\n|& & &|\n|& & &|\n|____9|\n";
                case 10: return " _____ \n|10 & |\n|& & &|\n|& & &|\n|& & &|\n|____10|\n";
                case 11: return " _____ \n|J  ww|\n| o {)|\n|o o% |\n| | % |\n|__%%J|\n";
                case 12: return " _____ \n|Q  ww|\n| o {(|\n|o o%%|\n| |%%%|\n|_%%%Q|\n";
                case 13: return " _____ \n|K  WW|\n| o {)|\n|o o%%|\n| |%%%|\n|_%%%K|\n";
                default: return "Wrong value.";
            }
         }
            else if (this.getType().equals("Diamonds")){
            switch(this.getValue()){
                case 14: return " _____\n|A ^  |\n| / \\ |\n| \\ / |\n|  .  |\n|____A|\n";
                case 2: return " _____\n|2    |\n|  o  |\n|     |\n|  o  |\n|____2|\n";
                case 3: return " _____ \n|3    |\n| o o |\n|     |\n|  o  |\n|____3|\n";
                case 4: return " _____ \n|4    |\n| o o |\n|     |\n| o o |\n|____4|\n";
                case 5: return " _____ \n|5    |\n| o o |\n|  o  |\n| o o |\n|____5|\n";
                case 6: return " _____ \n|6    |\n| o o |\n| o o |\n| o o |\n|____6|\n";
                case 7: return " _____ \n|7    |\n| o o |\n|o o o|\n| o o |\n|____7|\n";
                case 8: return " _____ \n|8    |\n|o o o|\n| o o |\n|o o o|\n|____8|\n";
                case 9: return " _____ \n|9    |\n|o o o|\n|o o o|\n|o o o|\n|____9|\n";
                case 10: return " _____ \n|10 o |\n|o o o|\n|o o o|\n|o o o|\n|____10|\n";
                case 11: return " _____ \n|J  ww|\n| /\\{)|\n| \\/% |\n|   % |\n|__%%J|\n";
                case 12: return " _____ \n|Q  ww|\n| /\\{(|\n| \\/%%|\n|  %%%|\n|_%%%Q|\n";
                case 13: return " _____ \n|K  WW|\n| /\\{)|\n| \\/%%|\n|  %%%|\n|_%%%K|\n";
                default: return "Wrong value.";
            }
        }else {
                return "Wrong type";
            }
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
    
    
}
