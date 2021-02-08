import java.util.ArrayList;
import java.util.List;

public class Solution {

    private final List<List<Integer>> list;
    List<Integer> integerList = new ArrayList<Integer>();

    public Solution() {
        this.list = new ArrayList<List<Integer>>();
    }

    public List<List<Integer>> subsets(int[] nums) {
        search(0, nums);
        return list;
    }


    public void search(int k, int[] nums) {
        if (k == nums.length) {
            List<Integer> clone = new ArrayList<Integer>(integerList);
            list.add(clone);
        } else {
            integerList.add(nums[k]);
            search(k + 1, nums);
            integerList.remove(integerList.size() - 1);
            search(k + 1, nums);
        }
    }
}
