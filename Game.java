class Game {
    private Board board;
    private Player playerX;
    private Player playerO;
    private Player currentPlayer;

    public Game() {
        board = new Board();
        playerX = new Player("X");
        playerO = new Player("O");
        currentPlayer = playerX; 
    }

    public void start() {
        System.out.println("Welcome to Tic Tac Toe!");
        board.printBoard(); 

        boolean gameOver = false;
        while (!gameOver) {
            int position = currentPlayer.choosePosition(board);
            board.makeMove(position, currentPlayer.getSymbol());
            board.printBoard(); 

            String result = board.checkGameOver();
            if (result.equals("win")) {
                System.out.println("Player " + currentPlayer.getSymbol() + " wins!");
                gameOver = true; 
            } else if (result.equals("tie")) {
                System.out.println("It's a tie!");
                gameOver = true; 
            } else {
                switchPlayer();
            }
        }
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == playerX) ? playerO : playerX; 
    }
}
