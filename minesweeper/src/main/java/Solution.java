class Solution {
    public char[][] updateBoard(char[][] board, int[] click) {
        if (board[click[0]][click[1]] == 'M') {
            board[click[0]][click[1]] = 'X';
            return board;
        } else if (board[click[0]][click[1]] == 'E') {
            checkStatus(board, click);
        }
        return board;
    }


    private void checkStatus(char[][] board, int[] click) {
        int count = 0;

        for (int i = click[0] - 1; i <= click[0] + 1; i++) {
            for (int j = click[1] - 1; j <= click[1] + 1; j++) {
                if (i >= 0 && j >= 0 && i < board.length && j < board[0].length && board[i][j] == 'M') {
                    count++;
                    board[click[0]][click[1]] = Character.forDigit(count, 10);
                }
            }
        }

        if (count == 0) {
            for (int i = click[0] - 1; i <= click[0] + 1; i++) {
                for (int j = click[1] - 1; j <= click[1] + 1; j++) {
                    if (i >= 0 && j >= 0 && i < board.length && j < board[0].length && board[i][j] == 'E') {
                        board[click[0]][click[1]] = 'B';
                        checkStatus(board, new int[]{i, j});
                    }
                }
            }
        }
    }
}
