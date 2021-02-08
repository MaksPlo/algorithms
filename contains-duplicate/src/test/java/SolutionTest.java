import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void test1() {
        int[] nums = new int[]{1, 2, 3, 1};

        Solution solution = new Solution();

        boolean result = solution.containsDuplicate(nums);

        assertTrue(result);
    }

    @Test
    void test2() {
        int[] nums = new int[]{1, 2, 3, 4};

        Solution solution = new Solution();

        boolean result = solution.containsDuplicate(nums);

        assertFalse(result);
    }
}