package ca.sheridancollege.project;

import java.util.Scanner;

/** This class is used to outline the rules to the User, and ask them 
 * if they still want to continue starting a Game of War.
 *
 */
public class Rules {
    
    /**
     * Simple Dialog 
     * To outline the rules of the game and the hot keys to use.
     * 
     * @return false if the Player wants to Quit the Game otherwise return true
     * if the player wants to continue.
     */
    public boolean getString(){
            Scanner sc = new Scanner(System.in);
            boolean confused = true;
            do {
                while (confused){
                    System.out.println("Your goal is to collect all 52 cards.");
                    System.out.println("You will be given half a shuffled deck and being placed against an opponent who has the other half.");
                    System.out.println("In this case it will be a computer.");
                    System.out.println("You will not be able to see your cards, as they are faced down.");
                    System.out.println("To collect a card you must flip over the top card.");
                    System.out.println("Then depending on the rank of the card you flipped over you will either Keep it, Lose it or Go To War.");
                    System.out.println("The ranking of each card from weakest to strongest is as follows: ");
                    System.out.println("2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, and A.");
                    System.out.println("If you understood the Instructions: Enter Y. or Q to Quit.");
                    String instructions = sc.nextLine();
                    if (instructions.equalsIgnoreCase("Y")){
                        confused = false;
                    }
                    else if (instructions.equalsIgnoreCase("Q")){
                        return false;
                    }
                    else {
                        System.out.println("Invalid input. Here are the instructions again:");
                    }
                }
            System.out.println("Rules: You can Flip A Card, Check how many cards you have left"
                    + " you have left or Quit at any time.");
            System.out.println("The hotkeys are: \nF to flip a card.");
            System.out.println("C to view the number of cards you have.");
            System.out.println("Q to quit at any time.");
            System.out.println("If you understand the rules enter Y. If you want to quit enter Q.");
            String result = sc.nextLine();
            
            if (result.equalsIgnoreCase("Y")){
                return true;
            } else if (result.equalsIgnoreCase("Q")){
                return false;                
            }
            else {
                System.out.println("Invalid input. Here are the rules again: ");
            }
            } while(true);
        
    }
    
}
