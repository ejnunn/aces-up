import java.util.Scanner;

import enums.Suit;

public class Main {

    private static Scanner userInput = new Scanner(System.in);

    /**
     * Starts a new game of Aces Up.
     * 
     * @param args
     */
    public static void main(String[] args){
        System.out.println("Let's play Aces Up!");
        
        AcesUpEngine gameEngine = new AcesUpEngine();
        
        gameEngine.playGame();
        
        System.out.println("PROGRAM EXITING.");
    }
}
