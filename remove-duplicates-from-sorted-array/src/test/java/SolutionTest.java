import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void test1() {
        int[] nums = new int[3];
        nums[0] = 1;
        nums[1] = 1;
        nums[2] = 2;

        Solution solution = new Solution();

        int result = solution.removeDuplicates(nums);

        assertEquals(2, result);
    }

    @Test
    void test2() {
        int[] nums = new int[10];
        nums[0] = 0;
        nums[1] = 0;
        nums[2] = 1;
        nums[3] = 1;
        nums[4] = 1;
        nums[5] = 2;
        nums[6] = 2;
        nums[7] = 3;
        nums[8] = 3;
        nums[9] = 4;


        Solution solution = new Solution();

        int result = solution.removeDuplicates(nums);

        assertEquals(5, result);
    }

    @Test
    void test3() {
        Solution solution = new Solution();

        int result = solution.removeDuplicates(new int[0]);

        assertEquals(0, result);
    }

    @Test
    void test4() {
        Solution solution = new Solution();

        int[] nums = new int[1];
        nums[0] = 1;

        int result = solution.removeDuplicates(nums);

        assertEquals(1, result);
    }

    @Test
    void test5() {
        Solution solution = new Solution();

        int[] nums = new int[2];
        nums[0] = 1;
        nums[1] = 2;

        int result = solution.removeDuplicates(nums);

        assertEquals(2, result);
    }

}