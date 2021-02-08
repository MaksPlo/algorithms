import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test1() {
        Solution solution = new Solution();
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};

        int res = solution.maxSubArray(nums);

        assertEquals(6, res);

    }
}