import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void test1() {
        Solution solution = new Solution();

        int res = solution.strStr("hello", "ll");

        assertEquals(2, res);
    }

    @Test
    void test2() {
        Solution solution = new Solution();

        int res = solution.strStr("a", "a");

        assertEquals(0, res);
    }

    @Test
    void test3() {
        Solution solution = new Solution();

        int res = solution.strStr("abc", "c");

        assertEquals(2, res);
    }

    @Test
    void test4() {
        Solution solution = new Solution();

        int res = solution.strStr("mississippi", "pi");

        assertEquals(9, res);
    }
}