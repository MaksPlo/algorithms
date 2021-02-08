import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int missingNumber(int[] nums) {

        List<Integer> list = new ArrayList<Integer>();

        for (int num : nums) {
            list.add(num);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!list.contains(i)) {
                return i;
            }
        }

        return 0;
    }
}
