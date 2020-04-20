package ca.sheridancollege.project;

import java.util.Scanner;

/**
 * The main event of the Game of War.
 * After the user has accepted to play they are now considered "in the game".
 * "in the game" implies that whenever you leave the cards left in your deck
 * correlates to whether you win, lose or draw.
 */
public class War {
    public boolean play(){
        // Create a Scanner object to read in inputs from the keyboard.
        Scanner sc = new Scanner(System.in);
        // Create a comparer object to compare cards.
        Cardcomparison comparer = new Cardcomparison();
        // Create the human player.
        WarPlayer player1;
        // Create the computer player.
        WarPlayer player2 = new WarPlayer("Computer");
        System.out.println("Shuffling deck.....");
        // Create a whole new deck and shuffle it.
        TotalCards wholeDeck = new TotalCards();
        wholeDeck.shuffle();
        System.out.println("Splitting deck in half......");
        // Split the whole deck into two equal halves.
        DeckSplit split = new DeckSplit(wholeDeck.getCards());
        System.out.println("What would you like to be called?");
        // Ask human for a name.
        player1 = new WarPlayer(sc.nextLine());
        System.out.println("Giving Cards to "+ player1.getPlayerID() +" ......");
        // Give the first half of the deck to the human.
        player1.setMyHand(split.getUserCards());
        // Give the other half of the deck to the computer.
        player2.setMyHand(split.getComputerCards());
        do{
            // Start of a round
            String move;
            System.out.println("Your turn "+player1.getPlayerID()+" :");
            System.out.println("The hotkeys are: \nF to flip a card.");
            System.out.println("C to view the number of cards you have.");
            System.out.println("Q to quit at any time.");
            move = sc.nextLine();
            // Flipping a card.
            if (move.equalsIgnoreCase("F")){
                // Checking if players have ran out of cards.
                if(player1.play() && player2.play()){
                    // Compare the players hands.
                    if(comparer.Compare(player1, player2)){
                        // End of round.
                        System.out.println("Next Hand:");
                    }
                    // If Players run out of cards during a Game Of War print results on the screen and end game.
                    else {
                        if (player1.CardsInDeck() > player2.CardsInDeck()){
                            System.out.println("You Win! You ended with more cards. Your cards: " +player1.CardsInDeck() + " Your opponent's cards: " + player2.CardsInDeck());
                        }
                        else if(player1.CardsInDeck() < player2.CardsInDeck()){
                            System.out.println("You Lose! You ended with less cards. Your cards: " +player1.CardsInDeck() + " Your opponent's cards: " + player2.CardsInDeck());
                        }
                        else{
                            System.out.println("It's a draw! You both have the same amount of cards. Which is: "+player1.CardsInDeck());
                        }
                        return true;
                    }
                }
                // Players have ran out of cards, print results on the screen and end game.
                else{
                    if (player1.CardsInDeck() > player2.CardsInDeck()){
                    System.out.println("You Win! You ended with more cards. Your cards: " +player1.CardsInDeck() + " Your opponent's cards: " + player2.CardsInDeck());
                    }
                    else if(player1.CardsInDeck() < player2.CardsInDeck()){
                        System.out.println("You Lose! You ended with less cards. Your cards: " +player1.CardsInDeck() + " Your opponent's cards: " + player2.CardsInDeck());
                    }
                    else{
                        System.out.println("It's a draw! You both have the same amount of cards. Which is: "+player1.CardsInDeck());
                    }
                    return true;
                }
            }
            // Simply print the players current cards to see their progression.
            else if (move.equalsIgnoreCase("C")){
                System.out.println("#######################################################################");
                System.out.println(player1.getPlayerID() + " has " + player1.CardsInDeck() + " cards left.");
                System.out.println("#######################################################################");
            }
            // Quit any time and print results.
            else if (move.equalsIgnoreCase("Q")){
                if (player1.CardsInDeck() > player2.CardsInDeck()){
                    System.out.println("You Win! You ended with more cards. Your cards: " +player1.CardsInDeck() + " Your opponent's cards: " + player2.CardsInDeck());
                }
                else if(player1.CardsInDeck() < player2.CardsInDeck()){
                    System.out.println("You Lose! You ended with less cards. Your cards: " +player1.CardsInDeck() + " Your opponent's cards: " + player2.CardsInDeck());
                }
                else{
                    System.out.println("It's a draw! You both have the same amount of cards. Which is: "+player1.CardsInDeck());
                }
                return true;
            }
            // Exception handling any invalid inputs that are not "F/f", "C/c", or "Q/q".
            else {
                System.out.println("Invalid move. Here are the valid hotkeys: ");
            }
        } while (true);
        
        
    }
    
}
