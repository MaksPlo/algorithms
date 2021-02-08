import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void test1() {
        Solution solution = new Solution();
        String s = "anagram";
        String t = "nagaram";

        boolean result = solution.isAnagram(s, t);

        assertTrue(result);
    }


    @Test
    void test2() {
        Solution solution = new Solution();
        String s = "rat";
        String t = "car";

        boolean result = solution.isAnagram(s, t);

        assertFalse(result);
    }
}