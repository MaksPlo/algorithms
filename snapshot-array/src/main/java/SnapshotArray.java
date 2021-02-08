import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class SnapshotArray {

    List<TreeMap<Integer, Integer>> nums;

    int SNAP;

    public SnapshotArray(int length) {
        this.nums = new ArrayList<>();
        SNAP = 0;
        for (int i = 0; i < length; i++) {
            TreeMap<Integer, Integer> map = new TreeMap<>();
            map.put(0, 0);
            nums.add(map);
        }
    }

    public void set(int index, int val) {
        nums.get(index)
                .put(SNAP, val);
    }

    public int snap() {
        SNAP++;
        return SNAP - 1;
    }

    public int get(int index, int snap_id) {
        return nums.get(index)
                .floorEntry(snap_id)
                .getValue();
    }
}
