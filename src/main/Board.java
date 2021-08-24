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

    @Override
    public String toString() {
        String result = "";
        result = boardHeaderToString();

        String prefix = "\n";
        for (int i = 0; i < maxStackSize; i++) {
            result += prefix;
            result += rowToString(i);
        }

        result += String.format("\n| %49s |", "").replace(" ", "-");

        
        return result;
    }

    private String boardHeaderToString() {
        String result = String.format("| %49s |\n", "").replace(" ", "-");
        result += String.format("| %10s |", "STACK 1");
        result += String.format("%11s |", "STACK 2");
        result += String.format("%11s |", "STACK 3");
        result += String.format("%11s |", "STACK 4");
        result += "\n";
        result += String.format("| %10s |", "").replace(" ", "-");
        result += String.format("%11s |", "").replace(" ", "-");
        result += String.format("%11s |", "").replace(" ", "-");
        result += String.format("%11s |", "").replace(" ", "-");
        return result;
    }

    private String rowToString(int rowIndex) {
        String rowString = "| ";
        for (int i = 0; i < NUMBER_OF_STACKS; i++) {
            Stack<Card> currentStack = this.boardStacks.get(i);
            Card currentCard = null;
            if (!currentStack.isEmpty() && currentStack.size() > rowIndex) {
                currentCard = currentStack.get(rowIndex);
            }
            if (currentCard != null) {
                rowString += String.format("%10s |", currentCard.toString());
            } else {
                rowString += String.format("%10s |", "");
            }
            rowString += " "; // formatting between Cards
        }
        return rowString;
    }

}
