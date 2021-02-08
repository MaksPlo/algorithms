import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test1() {
        Solution solution = new Solution();

        int result = solution.reverseBits(43261596);

        assertEquals(964176192 , result);
    }


    @Test
    void test2() {
        Solution solution = new Solution();

        int result = solution.reverseBits(-3);

        assertEquals(-1073741825 , result);
    }
}