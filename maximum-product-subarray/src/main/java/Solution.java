public class Solution {
    public int maxProduct(int[] nums) {
        int best = 0;
        int current = 0;

        if (nums.length == 1) {
            return nums[0];
        }

        for (int num : nums) {
            int test = current * num;
            current = Math.max(num, test);
            best = Math.max(best, current);
        }

        return best;
    }
}
