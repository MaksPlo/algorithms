public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty() || haystack.equals(needle)) {
            return  0;
        } else {
            String substring;
            for (int i = 0; i <= haystack.length() - needle.length(); i++) {
                substring = haystack.substring(i, i + needle.length());
                if (needle.equals(substring)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
