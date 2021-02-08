import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void test1() {
        Solution solution = new Solution();
        int[] nums = new int[]{2, 3, -2, 4};
        int result = solution.maxProduct(nums);

        assertEquals(6, result);
    }

    @Test
    void test2() {
        Solution solution = new Solution();
        int[] nums = new int[]{-2};
        int result = solution.maxProduct(nums);

        assertEquals(-2, result);
    }


    @Test
    void test3() {
        Solution solution = new Solution();
        int[] nums = new int[]{-3,-1,-1};
        int result = solution.maxProduct(nums);

        assertEquals(3, result);
    }
}