import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sMap = countLetters(s);
        Map<Character, Integer> tMap = countLetters(t);

        return sMap.equals(tMap);
    }


    private Map<Character, Integer> countLetters(String s) {
        Map<Character, Integer> sMap = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            Integer val = sMap.get(s.charAt(i));
            if (val != null) {
                sMap.put(s.charAt(i), ++val);
            } else {
                sMap.put(s.charAt(i), 1);
            }
        }
        return sMap;
    }
}
