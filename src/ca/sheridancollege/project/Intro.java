package ca.sheridancollege.project;

import java.awt.Font;
import java.util.Scanner;

/**
 * This class is used just to create the intro and ask if the Player wants
 * to start a game of War.

 */
public class Intro {
    public boolean getString(){
        Scanner sc = new Scanner(System.in);
        
        ASCII t = new ASCII();
        Font font = new Font("SansSerif", 0, 15);

        Settings setting = new Settings(font ,115, 100);
        t.drawString("The War", "#", setting);
        do {
        System.out.println("Would you like to play? Enter Y or N");
        String result = sc.nextLine();
        if (result.equalsIgnoreCase("Y")){
            return true;
        }
        else if(result.equalsIgnoreCase("N")){
            return false;
        }
        else{
            System.out.println("Invalid Input, please try again.");
        }
        } while(true);
            
        
    }
  
    
}
