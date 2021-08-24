import java.util.ArrayList;
import java.util.Scanner;

import enums.Suit;

public class AcesUpEngine {
    Scanner scanner;
    Board gameBoard;
    ArrayList<String> menuItems;
    
    public AcesUpEngine() {
        scanner = new Scanner(System.in);
        gameBoard = new Board();
        menuItems = new ArrayList<>();

        menuItems.add("RULES");
        
    }

    


    private void displayMenu() {
        System.out.println("1. Start new game.");
        System.out.println("2. Show rules.");
        System.out.println("3. Quit.");
    }

    public void playGame() {
        String currentPlayerAction;

        displayMenu();

        try {
            System.out.print(">>> ");
            currentPlayerAction = getActionFromMenu();
        }
        catch (Exception e) {
            currentPlayerAction = "ERROR Cannoot get player action.";
            System.err.println(e);
        }
        
        if (currentPlayerAction == "1" || currentPlayerAction == "RULES") {
            System.out.println("These are the rules.\n1. Four cards are dealt.\n2. Discard all cards that share a SUIT and have a smaller FACE VALUE.\n3. Continue dealing and discarding until the deck is empty.\n4. The game is won if only the four ACES are left on the board.");
        }
        else if (currentPlayerAction == null) {
            System.out.println("NULL ACTION.");
        }
        else {
            System.out.println("ACTION FAILED.");
        }
        

        System.out.print("\033[H\033[2J"); // clears terminal screen
        
        this.gameBoard.addCardToStack(new Card(Suit.CLUB, 7), 0);

        System.out.println(this.gameBoard.toString());
        
}

    /**
     * Show the game menu and get a selection from the player.
     * @return String playerAction - Index of action item from the menu list
     */
    private String getActionFromMenu() {
        String playerAction;
        String formattedAction;

        playerAction = scanner.next();

        formattedAction = parseAction(playerAction);
        return formattedAction;
    }

    private String parseAction(String rawUserInput) {
        String formattedAction = "";
        for (int i = 0; i < menuItems.size(); i++) {
            if (rawUserInput.trim().toUpperCase() == menuItems.get(i)) {
                formattedAction = menuItems.get(i);
            }
        }
        return formattedAction;
    }
    


}
