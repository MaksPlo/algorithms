import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void test1() {
        int[] nums = new int[]{1, 2, 3};
        int[] output = new int[]{1, 2, 4};
        Solution solution = new Solution();

        int[] ints = solution.plusOne(nums);

        assertEquals(output[0], ints[0]);
        assertEquals(output[1], ints[1]);
        assertEquals(output[2], ints[2]);
    }

    @Test
    void test2() {
        int[] nums = new int[]{9};
        int[] output = new int[]{1, 0};
        Solution solution = new Solution();

        int[] ints = solution.plusOne(nums);

        assertEquals(output[0], ints[0]);
        assertEquals(output[1], ints[1]);
    }

    @Test
    void test3() {
        int[] nums = new int[]{9,9};
        int[] output = new int[]{1,0,0};
        Solution solution = new Solution();

        int[] ints = solution.plusOne(nums);

        assertEquals(output[0], ints[0]);
        assertEquals(output[1], ints[1]);
        assertEquals(output[2], ints[2]);
    }
}