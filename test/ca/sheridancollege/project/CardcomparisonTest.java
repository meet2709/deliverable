/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class CardcomparisonTest {
    
    public CardcomparisonTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Compare method, of class Cardcomparison.
     */
    @Test
    public void testCompareHumanWins() {
        System.out.println("====Compare Cards Good====");
        System.out.println("Human player card is greater than Computer Card");
        // Create a Human and Computer player
        WarPlayer player1 = new WarPlayer("Human");
        WarPlayer player2 = new WarPlayer("Computer");
        
        // Create Two cards from DeckOfCards class, one being bigger than the other.
        DeckOfCards bigCard = new DeckOfCards(12, "Hearts");
        DeckOfCards smallCard = new DeckOfCards(3, "Spades");
        
        //Give the bigger card to Human and smaller to Computer
        player1.setPlayedCard(bigCard);
        player2.setPlayedCard(smallCard);
        //Create an instance of Cardcomparison class that will be used to call the method.
        Cardcomparison comparer = new Cardcomparison();
        
        boolean expResult = true;
        boolean result = comparer.Compare(player1, player2);
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of Compare method, of class Cardcomparison.
     */
    @Test
    public void testCompareComputerWins() {
        System.out.println("====Compare Cards Good====");
        System.out.println("Computer player card is greater than Human Card");
        // Create a Human and Computer player
        WarPlayer player1 = new WarPlayer("Human");
        WarPlayer player2 = new WarPlayer("Computer");
        
        // Create Two cards from DeckOfCards class, one being bigger than the other.
        DeckOfCards bigCard = new DeckOfCards(12, "Hearts");
        DeckOfCards smallCard = new DeckOfCards(3, "Spades");
        
        //Give the bigger card to Computer and smaller to Human
        player2.setPlayedCard(bigCard);
        player1.setPlayedCard(smallCard);
        //Create an instance of Cardcomparison class that will be used to call the method.
        Cardcomparison comparer = new Cardcomparison();
        
        boolean expResult = true;
        boolean result = comparer.Compare(player1, player2);
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of Compare method, of class Cardcomparison.
     */
    @Test
    public void testCompareBothPlayersNoCards() {
        System.out.println("====Compare Cards Bad====");
        System.out.println("No Cards added to any players hands.");
        // Create a Human and Computer player
        WarPlayer player1 = new WarPlayer("Human");
        WarPlayer player2 = new WarPlayer("Computer");
        
        // Create Two cards from DeckOfCards class, one being bigger than the other.
        DeckOfCards bigCard = new DeckOfCards(12, "Hearts");
        DeckOfCards smallCard = new DeckOfCards(3, "Spades");
        
         
        //Create an instance of Cardcomparison class that will be used to call the method.
        Cardcomparison comparer = new Cardcomparison();
        // No cards were added to the human or computer hand so this should return true.
        boolean expResult = true;
        boolean result = comparer.Compare(player1, player2);
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of Compare method, of class Cardcomparison.
     */
    @Test
    public void testCompareOnePlayersNoCards() {
        System.out.println("====Compare Cards Boundary====");
        System.out.println("Only one Card added to a player's hands.");
        // Create a Human and Computer player
        WarPlayer player1 = new WarPlayer("Human");
        WarPlayer player2 = new WarPlayer("Computer");
        
         
        // Create One card from DeckOfCards class.
        DeckOfCards bigCard = new DeckOfCards(12, "Hearts");
        
        // Give one card to computer, and no cards to human.
        player2.setPlayedCard(bigCard);

         
        //Create an instance of Cardcomparison class that will be used to call the method.
        Cardcomparison comparer = new Cardcomparison();
        // No cards were added to the human hand so this should return true.
        boolean expResult = true;
        boolean result = comparer.Compare(player1, player2);
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of Compare method, of class Cardcomparison.
     */
    @Test
    public void testCompareWarBad() {
        System.out.println("====Compare Cards Bad====");
        System.out.println("Both players have the same card rank different suit.");
        System.out.println("Only one card in each player's deck.");
        // Create a Human and Computer player
        WarPlayer player1 = new WarPlayer("Human");
        WarPlayer player2 = new WarPlayer("Computer");
        
         
        // Create two cards same rank different suit from DeckOfCards class.
        DeckOfCards bigCard = new DeckOfCards(12, "Hearts");
        DeckOfCards bigCard1 = new DeckOfCards(12, "Spades");

        
        // Set both players hands to same card but different suit.
        player1.setPlayedCard(bigCard1);
        player2.setPlayedCard(bigCard);

         
        //Create an instance of Cardcomparison class that will be used to call the method.
        Cardcomparison comparer = new Cardcomparison();
        // Game of War shall happen and then the players will try to draw from their deck
        // But their deck will be empty and thus return false ending the game.
        boolean expResult = false;
        boolean result = comparer.Compare(player1, player2);
        assertEquals(expResult, result);
        
    }
    
     /**
     * Test of Compare method, of class Cardcomparison.
     */
    @Test
    public void testCompareWarBoundary() {
        System.out.println("====Compare Cards Boundary====");
        System.out.println("Both players have the same card rank and same suit.");
        System.out.println("Only one card in each player's deck.");
        // Create a Human and Computer player
        WarPlayer player1 = new WarPlayer("Human");
        WarPlayer player2 = new WarPlayer("Computer");
        
         
        // Create two cards same rank different suit from DeckOfCards class.
        DeckOfCards bigCard = new DeckOfCards(12, "Hearts");
        DeckOfCards bigCard1 = new DeckOfCards(12, "Hearts");

        
        // Set both players hands to same card but different suit.
        player1.setPlayedCard(bigCard1);
        player2.setPlayedCard(bigCard);

         
        //Create an instance of Cardcomparison class that will be used to call the method.
        Cardcomparison comparer = new Cardcomparison();
        // Game of War shall happen because it doesn't card about suit
        // and then the players will try to draw from their deck
        // But their deck will be empty and thus return false ending the game.
        boolean expResult = false;
        boolean result = comparer.Compare(player1, player2);
        assertEquals(expResult, result);
        
    }
    
     /**
     * Test of Compare method, of class Cardcomparison.
     */
    @Test
    public void testCompareWarGood() {
        System.out.println("====Compare Cards Good====");
        System.out.println("Both players have the same card rank and different suit.");
        System.out.println("One card in Computers Hand and two Cards in Human Hand.");
        System.out.println("A War will happen, but Computer will have no more cards to play the war.");

        // Create a Human and Computer player
        WarPlayer player1 = new WarPlayer("Human");
        WarPlayer player2 = new WarPlayer("Computer");
        
         
        // Create two cards same rank different suit from DeckOfCards class.
        DeckOfCards bigCard = new DeckOfCards(12, "Hearts");
        DeckOfCards bigCard1 = new DeckOfCards(12, "Spades");
        DeckOfCards bigCard2 = new DeckOfCards(13, "Clubs");

        
        // Set both players hands to same card but different suit.
        player1.setPlayedCard(bigCard1);
        player1.setPlayedCard(bigCard2);
        player2.setPlayedCard(bigCard);

         
        //Create an instance of Cardcomparison class that will be used to call the method.
        Cardcomparison comparer = new Cardcomparison();
        // Game of War shall happen Computer will try to draw from their deck
        // But their deck will be empty and thus return false ending the game.
        boolean expResult = false;
        boolean result = comparer.Compare(player1, player2);
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of Compare method, of class Cardcomparison.
     */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testCompareDoubleCardsBad() {
        System.out.println("====Compare Cards Bad====");
        System.out.println("Human player has two of the same card.");
        // Create a Human and Computer player
        WarPlayer player1 = new WarPlayer("Human");
        WarPlayer player2 = new WarPlayer("Computer");
        
        // Create Two cards from DeckOfCards class, one being bigger than the other.
        DeckOfCards bigCard = new DeckOfCards(12, "Hearts");
        DeckOfCards smallCard = new DeckOfCards(12, "Hearts");
        
        //Give the bigger card to Human and smaller to Computer
        player1.setPlayedCard(bigCard);
        player1.setPlayedCard(smallCard);
        //Create an instance of Cardcomparison class that will be used to call the method.
        Cardcomparison comparer = new Cardcomparison();
        
        boolean expResult = false;
        boolean result = comparer.Compare(player1, player2);
       
        
    }
    /**
     * Test of Compare method, of class Cardcomparison.
     */
    @Test
    public void testCompareNoCards() {
        System.out.println("====Compare Cards Boundary====");
        System.out.println("Each player has zero cards");
        // Create a Human and Computer player
        WarPlayer player1 = new WarPlayer("Human");
        WarPlayer player2 = new WarPlayer("Computer");
        
         
     
        //Create an instance of Cardcomparison class that will be used to call the method.
        Cardcomparison comparer = new Cardcomparison();
        
        boolean expResult = true;
        boolean result = comparer.Compare(player1, player2);
        assertEquals(expResult, result);
        
    }
}
