import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void test1() {
        Solution solution = new Solution();

        char[][] board = new char[4][5];
        board[0][0] = 'E';
        board[0][1] = 'E';
        board[0][2] = 'E';
        board[0][3] = 'E';
        board[0][4] = 'E';
        board[1][0] = 'E';
        board[1][1] = 'E';
        board[1][2] = 'M';
        board[1][3] = 'E';
        board[1][4] = 'E';
        board[2][0] = 'E';
        board[2][1] = 'E';
        board[2][2] = 'E';
        board[2][3] = 'E';
        board[2][4] = 'E';
        board[3][0] = 'E';
        board[3][1] = 'E';
        board[3][2] = 'E';
        board[3][3] = 'E';
        board[3][4] = 'E';

        int[] click = new int[2];
        click[0] = 3;
        click[1] = 0;

        char[][] result = solution.updateBoard(board, click);

        assertEquals('B', result[0][0]);
        assertEquals('1', result[0][1]);
        assertEquals('E', result[0][2]);
        assertEquals('1', result[0][3]);
        assertEquals('B', result[0][4]);
        assertEquals('B', result[1][0]);
        assertEquals('1', result[1][1]);
        assertEquals('M', result[1][2]);
        assertEquals('1', result[1][3]);
        assertEquals('B', result[1][4]);
        assertEquals('B', result[2][0]);
        assertEquals('1', result[2][1]);
        assertEquals('1', result[2][2]);
        assertEquals('1', result[2][3]);
        assertEquals('B', result[2][4]);
        assertEquals('B', result[3][0]);
        assertEquals('B', result[3][1]);
        assertEquals('B', result[3][2]);
        assertEquals('B', result[3][3]);
        assertEquals('B', result[3][4]);
    }
}