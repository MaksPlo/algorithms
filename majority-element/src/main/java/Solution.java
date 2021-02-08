import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int num : nums) {
            Integer value = map.get(num);
            if (value != null) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        int key = 0;
        Integer value = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (key < entry.getValue()) {
                key = entry.getValue();
                value = entry.getKey();
            }
        }

        return value;
    }
}
