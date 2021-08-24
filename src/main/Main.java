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

        System.out.println("Before");
        String currentPlayerAction = gameEngine.getActionFromMenu();
        System.out.println("After");

        if (currentPlayerAction == "Show Ruleset") {
            System.out.println("These are the rules.\n1. Four cards are dealt.\n2. Discard all cards that share a SUIT and have a smaller FACE VALUE.\n3. Continue dealing and discarding until the deck is empty.\n4. The game is won if only the four ACES are left on the board.");
        }
        Board gameBoard = new Board();
        
        // gameEngine.startGame();
        String junk = userInput.nextLine();

        System.out.print("\033[H\033[2J"); // clears terminal screen
        
        gameBoard.addCardToStack(new Card(Suit.CLUB, 7), 0);

        gameBoard.displayBoard();
        
    }
}
