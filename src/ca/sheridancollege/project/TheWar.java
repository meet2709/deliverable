package ca.sheridancollege.project;

/**
 * This class is used to run the Card Game Of War.
 * Create a TheWar object and call the play() method in a different class.
 */
public class TheWar extends Game{
    
    /**
     * Call the parent's constructor and give this Game a name.
     */
    public TheWar(){
        super("Game Of War");
    }
    
    /**
     * This function is used when the user quits early.
     */
    @Override
    public void declareWinner(){
        System.out.println("You ended before the game even started!");
        
    }
    
    /**
     * The start of the game.
     */
    @Override
    public void play(){
        // Create a intro object to use
        Intro playIntro = new Intro();
        // Create a rule object to use.
        Rules playRules = new Rules();
        // Create a war object to use.
        War war = new War();
        // Play the intro  https://www.baeldung.com/ascii-art-in-java
        // If user wants to continue playing then play the rules
        if (playIntro.getString()){
            // If user wants to contine playing after reading the rules
            if (playRules.getString()){
                // Start a game of war
                if (war.play())
                {
                    // Game is over result are posted.
                    System.out.println("^^^^^^^^^^^^^^^^Game Results^^^^^^^^^^^^^^^^");
                }
                else {
                    // Game is over before the game began.
                    this.declareWinner();
                }
            }
            else {
                // Game is over before the game began.
                this.declareWinner();
            }
        }
        else{
            // Game is over before the game began.
            this.declareWinner();
        }
    }

    
    
}
