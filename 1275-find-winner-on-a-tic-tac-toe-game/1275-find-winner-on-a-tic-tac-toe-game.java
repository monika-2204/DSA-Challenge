class Solution {
    public String tictactoe(int[][] moves) {

        char[][] board = new char[3][3];

        for (int i = 0; i < moves.length; i++) {
            int r = moves[i][0];
            int c = moves[i][1];

            if (i % 2 == 0) {
                board[r][c] = 'A';
            } else {
                board[r][c] = 'B';
            }
        }

        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != '\0' &&
                board[i][0] == board[i][1] &&
                board[i][1] == board[i][2]) {
                return String.valueOf(board[i][0]);
            }
        }

        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] != '\0' &&
                board[0][j] == board[1][j] &&
                board[1][j] == board[2][j]) {
                return String.valueOf(board[0][j]);
            }
        }

        // Main diagonal
        if (board[0][0] != '\0' &&
            board[0][0] == board[1][1] &&
            board[1][1] == board[2][2]) {
            return String.valueOf(board[0][0]);
        }

        // Anti-diagonal
        if (board[0][2] != '\0' &&
            board[0][2] == board[1][1] &&
            board[1][1] == board[2][0]) {
            return String.valueOf(board[0][2]);
        }

        return moves.length == 9 ? "Draw" : "Pending";
    }
}