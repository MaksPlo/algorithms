import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test1() {
        Solution solution = new Solution();

        List<List<String>> result = solution.solveNQueens(4);

        assertEquals(null, result);
    }
}