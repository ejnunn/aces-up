import java.util.Scanner;

public class Main {

    private static Scanner userInput = new Scanner(System.in);


    public static void main(String[] args){
        System.out.println("Let's play Aces Up!");
        
        AcesUpEngine gameEngine = new AcesUpEngine();
        // gameEngine.startGame();
        String junk = userInput.nextLine();

        System.out.print("\033[H\033[2J");
        
    }
}
