package array.medium;

import java.util.*;

public class GroupAnagrams {

    //time O(nlogN) space O(size of strs)
    static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> results = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            if (!results.containsKey(String.valueOf(charArray))) {
                results.put(String.valueOf(charArray), new ArrayList<>());
            }
            results.get(String.valueOf(charArray)).add(str);
        }

        return new ArrayList<>(results.values());
    }

    public static void main(String[] args) {
        String[] strs = new String[] {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> results = groupAnagrams(strs);
        System.out.println(results);
    }
}
