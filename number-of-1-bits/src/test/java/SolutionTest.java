import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test1() {
        Solution solution = new Solution();

        int result = solution.hammingWeight(11);

        assertEquals(3, result);
    }

    @Test
    void test2() {
        Solution solution = new Solution();

        int result = solution.hammingWeight( 4294967293);

        assertEquals(31, result);
    }
}