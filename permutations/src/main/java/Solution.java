import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<List<Integer>> result = new ArrayList<List<Integer>>();;
    boolean[] chosen;
    List<Integer> permutation = new ArrayList<Integer>();;



    public List<List<Integer>> permute(int[] nums) {

        if (chosen == null){
            chosen = new boolean[nums.length + 1];
        }

        if (permutation.size() == nums.length) {
            List<Integer> newPermutation = new ArrayList<Integer>(permutation);
            result.add(newPermutation);
        } else {
            for (int i = 0; i < nums.length; i++) {

                if (chosen[i]) {
                    continue;
                }
                chosen[i] = true;
                permutation.add(nums[i]);
                permute(nums);
                chosen[i] = false;
                if (!permutation.isEmpty()) {
                    permutation.remove(permutation.size() - 1);
                }
            }
        }

        return result;
    }
}
