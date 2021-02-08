import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test1() {
        Solution solution = new Solution();
        assertTrue(solution.isValid("()"));
    }


    @Test
    void test2() {
        Solution solution = new Solution();
         assertTrue(solution.isValid("()[]{}"));
    }


    @Test
    void test3() {
        Solution solution = new Solution();
        assertFalse(solution.isValid("(]"));
    }


    @Test
    void test4() {
        Solution solution = new Solution();
        assertFalse(solution.isValid("([)]"));
    }


    @Test
    void test5() {
        Solution solution = new Solution();
        assertTrue(solution.isValid("{[]}"));
    }


    @Test
    void test6() {
        Solution solution = new Solution();
        assertFalse(solution.isValid("(){}}{"));
    }


    @Test
    void test7() {
        Solution solution = new Solution();
        assertFalse(solution.isValid("]"));
    }


    @Test
    void test8() {
        Solution solution = new Solution();
        assertFalse(solution.isValid("(}{)"));
    }


    @Test
    void test9() {
        Solution solution = new Solution();
        assertFalse(solution.isValid("()))"));
    }


    @Test
    void test10() {
        Solution solution = new Solution();
        assertTrue(solution.isValid("(([]){})"));
    }


    @Test
    void test11() {
        Solution solution = new Solution();
        assertFalse(solution.isValid("(("));
    }


    @Test
    void test12() {
        Solution solution = new Solution();
        assertFalse(solution.isValid("[({])}"));
    }
}