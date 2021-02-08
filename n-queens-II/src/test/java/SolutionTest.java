import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test1() {
        Solution solution = new Solution();
        int result = solution.totalNQueens(4);

        assertEquals(2, result);
    }

    @Test
    void test2() {
        Solution solution = new Solution();
        int result = solution.totalNQueens(8);

        assertEquals(92, result);
    }

    @Test
    void test3() {
        Solution solution = new Solution();
        int result = solution.totalNQueens(16);

        assertEquals(14772512, result);
    }

    @Test
    void test4() {
        Solution solution = new Solution();
        int result = solution.totalNQueens(1);

        assertEquals(1, result);
    }
}