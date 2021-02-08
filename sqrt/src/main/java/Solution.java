public class Solution {

    public int mySqrt(int x) {
        int div = 1;
        int rslt = 0;
        while (x > 0) {
            x -= div;
            div += 2;
            rslt += x < 0 ? 0 : 1;
        }
        return rslt;
    }
}
