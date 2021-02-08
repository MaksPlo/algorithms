import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test1() {
        String s = "A man, a plan, a canal: Panama";

        Solution solution = new Solution();

        boolean result = solution.isPalindrome(s);

        assertTrue(result);
    }

    @Test
    void test2() {
        String s = "race a car";

        Solution solution = new Solution();

        boolean result = solution.isPalindrome(s);

        assertFalse(result);
    }


    @Test
    void test3() {
        String s = "0P";

        Solution solution = new Solution();

        boolean result = solution.isPalindrome(s);

        assertFalse(result);
    }
}