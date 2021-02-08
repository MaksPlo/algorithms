import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void test1() {
        Solution solution = new Solution();
        int[] nums = new int[]{3, 0, 1};

        int result = solution.missingNumber(nums);

        assertEquals(2, result);
    }

    @Test
    void test2() {
        Solution solution = new Solution();
        int[] nums = new int[]{0, 1};

        int result = solution.missingNumber(nums);

        assertEquals(2, result);
    }

    @Test
    void test3() {
        Solution solution = new Solution();
        int[] nums = new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1};

        int result = solution.missingNumber(nums);

        assertEquals(8, result);
    }

    @Test
    void test4() {
        Solution solution = new Solution();
        int[] nums = new int[]{0};

        int result = solution.missingNumber(nums);

        assertEquals(1, result);
    }
}