import java.util.*;
class Player {
    private String symbol;

    public Player(String symbol) {
        this.symbol = symbol; 
    }

    public String getSymbol() {
        return symbol; 
    }

    public int choosePosition(Board board) {
        Scanner scanner = new Scanner(System.in);
        int position;
        while (true) {
            System.out.print("Player " + symbol + ", choose a position (1-9): ");
            position = scanner.nextInt() - 1; 
            if (board.isValidMove(position)) {
                break; 
            }
            System.out.println("Invalid position or already taken. Try again.");
        }
        return position; 
    }
}
