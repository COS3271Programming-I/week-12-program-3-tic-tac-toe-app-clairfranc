package week12;

public class Week12Program3 {

    public static void main(String[] args) {
        // You will call ai() from here, but the method cannot be inside main.
        Week12Program3 game = new Week12Program3();
        game.ai();
    }

    // ---------------- AI METHOD ----------------
    public void ai() {

        char AI = 'O';
        char HUMAN = 'X';

        char[][] board = new char[3][3]; // You MUST initialize the board!

        // ---------- 1. Try to WIN ----------
        for (int r = 0; r < 3; r++) {
            if (board[r][0] == AI && board[r][1] == AI && board[r][2] == ' ') { placeMove(r, 2, AI); return; }
            if (board[r][0] == AI && board[r][2] == AI && board[r][1] == ' ') { placeMove(r, 1, AI); return; }
            if (board[r][1] == AI && board[r][2] == AI && board[r][0] == ' ') { placeMove(r, 0, AI); return; }
        }

        for (int c = 0; c < 3; c++) {
            if (board[0][c] == AI && board[1][c] == AI && board[2][c] == ' ') { placeMove(2, c, AI); return; }
            if (board[0][c] == AI && board[2][c] == AI && board[1][c] == ' ') { placeMove(1, c, AI); return; }
            if (board[1][c] == AI && board[2][c] == AI && board[0][c] == ' ') { placeMove(0, c, AI); return; }
        }

        if (board[0][0] == AI && board[1][1] == AI && board[2][2] == ' ') { placeMove(2, 2, AI); return; }
        if (board[0][0] == AI && board[2][2] == AI && board[1][1] == ' ') { placeMove(1, 1, AI); return; }
        if (board[1][1] == AI && board[2][2] == AI && board[0][0] == ' ') { placeMove(0, 0, AI); return; }

        if (board[0][2] == AI && board[1][1] == AI && board[2][0] == ' ') { placeMove(2, 0, AI); return; }
        if (board[0][2] == AI && board[2][0] == AI && board[1][1] == ' ') { placeMove(1, 1, AI); return; }
        if (board[1][1] == AI && board[2][0] == AI && board[0][2] == ' ') { placeMove(0, 2, AI); return; }

        // (BLOCKING AND STRATEGY CODE GOES HERE...)

        System.out.println("AI has no moves left.");
    }

    // ---------------- PLACE MOVE ----------------
    private void placeMove(int r, int c, char player) {
        System.out.println("Placing " + player + " at (" + r + "," + c + ")");
        // TODO: Actually update your game board here
    }

}