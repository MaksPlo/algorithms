import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void test1() {
        Solution solution = new Solution();
        String str = "leetcode";

        int i = solution.firstUniqChar(str);

        assertEquals(0, i);
    }

    @Test
    void test2() {
        Solution solution = new Solution();
        String str = "loveleetcode";

        int i = solution.firstUniqChar(str);

        assertEquals(2, i);
    }

    @Test
    void test3() {
        Solution solution = new Solution();
        String str = "cc";

        int i = solution.firstUniqChar(str);

        assertEquals(-1, i);
    }
}