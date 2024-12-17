
class Board {
    private String[] cells;

    public Board() {
        cells = new String[]{"-", "-", "-", "-", "-", "-", "-", "-", "-"};
    }

    public void printBoard() {
        System.out.println(cells[0] + " | " + cells[1] + " | " + cells[2]);
        System.out.println(cells[3] + " | " + cells[4] + " | " + cells[5]);
        System.out.println(cells[6] + " | " + cells[7] + " | " + cells[8]);
    }

    public boolean isValidMove(int position) {
        return position >= 0 && position < 9 && cells[position].equals("-"); 
    }

    public void makeMove(int position, String symbol) {
        cells[position] = symbol; 
    }

    public String checkGameOver() {
        String[][] winningCombinations = {
            {cells[0], cells[1], cells[2]}, {cells[3], cells[4], cells[5]}, {cells[6], cells[7], cells[8]},
            {cells[0], cells[3], cells[6]}, {cells[1], cells[4], cells[7]}, {cells[2], cells[5], cells[8]},
            {cells[0], cells[4], cells[8]}, {cells[2], cells[4], cells[6]}
        };

        for (String[] line : winningCombinations) {
            if (line[0].equals(line[1]) && line[1].equals(line[2]) && !line[0].equals("-")) {
                return "win";
            }
        }

        if (!String.join("", cells).contains("-")) {
            return "tie"; 
        }
        return "play"; 
    }
}
