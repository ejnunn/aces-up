import java.util.Scanner;

public class AcesUpEngine {

    Scanner scanner = new Scanner(System.in);
    
    /**
     * Show the game menu and get a selection from the player.
     * @return String playerAction - Index of action item from the menu list
     */
    public String getActionFromMenu() {
        String playerAction;

        showMenu();

        playerAction = scanner.nextLine(); // process holds until user input is validated

        return playerAction;
    }

    private void showMenu() {
        System.out.println("1. Start new game.");
        System.out.println("2. Show rules.");
        System.out.println("3. Quit.");
    }
    
}
