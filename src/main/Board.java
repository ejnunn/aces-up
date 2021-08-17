import java.util.*;

public class Board {
    private final int NUMBER_OF_STACKS = 4;
    private ArrayList<Stack<Card>> boardStacks;
    private int maxStackSize;

    public Board() {
        this.boardStacks = new ArrayList<>();

        for (int i = 0; i < NUMBER_OF_STACKS; i++) {
            this.boardStacks.add(new Stack<Card>());
        }

        this.maxStackSize = 0;

    }

    public void addCardToStack(Card card, int stackIndex) {
        Stack<Card> currentStack = this.boardStacks.get(stackIndex);
        currentStack.push(card);
        this.maxStackSize = getMaxStackStackSize();
    }

    public void removeCardFromStack(int stackIndex) {
        if (this.boardStacks.get(stackIndex).size() > 0) {
            this.boardStacks.get(stackIndex).pop();
        }
        this.maxStackSize = getMaxStackStackSize();
    }

    private int getMaxStackStackSize() {
        int maxSize = 0;
        for (int i = 0; i < NUMBER_OF_STACKS; i++) {
            maxSize = Math.max(maxSize, this.boardStacks.get(i).size());
        }
        return maxSize;
    }

    public void displayBoard() {
        
        for (int i = 0; i < NUMBER_OF_STACKS; i++) {
            Stack<Card> currentStack = this.boardStacks.get(i);
            Card currentCard = null;
            if (!currentStack.isEmpty()) {
                currentCard = currentStack.peek();
            }
            if (currentCard != null) {
                System.out.print(currentCard.toString());
            }
        }
    }

}
