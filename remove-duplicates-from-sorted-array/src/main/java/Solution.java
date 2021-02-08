class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }


        int length = nums.length;
        int[] result = new int[length];

        for (int i = 0; i < length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                if (nums.length - 1 - i >= 0) System.arraycopy(nums, i + 1, nums, i, nums.length - 1 - i);
                i--;
                length--;
                nums[nums.length - 1] = 0;
            }
        }

        System.arraycopy(nums, 0, result, 0, length);

        nums = new int[length];
        if (length >= 0) {
            System.arraycopy(result, 0, nums, 0, length);
        }

        return nums.length;
    }
}