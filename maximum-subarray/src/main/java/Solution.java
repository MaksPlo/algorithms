import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int maxSubArray(int[] nums) {
        List<Integer> sums = new ArrayList<Integer>();
        sums.add(Integer.MIN_VALUE);
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum = sum + nums[j];
                if (sum > sums.get(sums.size() - 1)) {
                    sums.add(sum);
                }
            }
        }
        Collections.sort(sums);

        return sums.get(sums.size() - 1);
    }
}