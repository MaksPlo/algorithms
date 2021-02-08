import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void test1() {
        Solution solution = new Solution();

        int[] nums = new int[3];
        nums[0] = 3;
        nums[1] = 2;
        nums[2] = 3;


        int i = solution.majorityElement(nums);

        assertEquals(3, i);
    }


    @Test
    void test2() {
        Solution solution = new Solution();

        int[] nums = new int[7];
        nums[0] = 2;
        nums[1] = 2;
        nums[2] = 1;
        nums[3] = 1;
        nums[4] = 1;
        nums[5] = 2;
        nums[6] = 2;


        int i = solution.majorityElement(nums);

        assertEquals(2, i);
    }
}