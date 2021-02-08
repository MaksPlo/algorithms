public class Solution {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 31, j =0 ; i >= 0; i--, j++) {
            if ((n & (1 << i)) != 0) {
                result = result | (1 << j);
            }
        }
        return result;
    }
}
