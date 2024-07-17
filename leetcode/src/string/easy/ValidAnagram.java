package string.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        List<Character> list = new ArrayList<>();
        for (Character c : s.toCharArray()) {
            list.add(c);
        }
        for (Character c : t.toCharArray()) {
            if (list.contains(c)) {
                list.remove(c);
            }
        }
        return list.isEmpty();
    }

    public static void main(String[] args) {
        boolean valid = isAnagram("anagram", "nagaram");
        System.out.print(valid);
    }
}
