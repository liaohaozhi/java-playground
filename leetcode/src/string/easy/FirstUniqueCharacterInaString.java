package string.easy;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacterInaString {

    public static int solve(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (Character c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
