public class Solution {
    public boolean isPalindrome(String s) {
        String str= s.replaceAll("\\p{Punct}+", "")
                .replaceAll(" ", "")
                .toLowerCase();

        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--){
            sb.append(str.charAt(i));
        }


        return sb.toString().equals(str);
    }
}
