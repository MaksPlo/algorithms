import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void test1() {
        Solution solution = new Solution();

        int result = solution.mySqrt(4);

        assertEquals(2, result);
    }

    @Test
    void test2() {
        Solution solution = new Solution();

        int result = solution.mySqrt(8);

        assertEquals(2, result);
    }
}