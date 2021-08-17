import java.util.Scanner;

import enums.Suit;

public class Main {

    private static Scanner userInput = new Scanner(System.in);


    public static void main(String[] args){
        System.out.println("Let's play Aces Up!");
        
        AcesUpEngine gameEngine = new AcesUpEngine();
        Board gameBoard = new Board();
        
        // gameEngine.startGame();
        String junk = userInput.nextLine();

        System.out.print("\033[H\033[2J"); // clears terminal screen
        
        gameBoard.addCardToStack(new Card(Suit.CLUB, 7), 0);

        gameBoard.displayBoard();
        
    }
}
