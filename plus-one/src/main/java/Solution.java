public class Solution {
    public int[] plusOne(int[] digits) {
        return increment(digits, digits.length - 1);
    }


    private int[] increment(int[] digits, int i) {
        int[] clone;

        if (i == 0 && (digits[i] == 9|| digits[i] == 10)) {
            clone = new int[digits.length + 1];
            clone[0] = 1;
            clone[1] = 0;
            for (int j = 2, k = 1; j < digits.length; j++, k++) {
                clone[j] = digits[k];
            }
            digits = clone;
        } else if (digits[i] == 9) {
            digits[i] = 0;
            digits = increment(digits, i - 1);
        }  else {
            digits[i] = digits[i] + 1;
        }

        return digits;
    }
}
