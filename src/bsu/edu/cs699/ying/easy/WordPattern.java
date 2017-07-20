package bsu.edu.cs699.ying.easy;

import java.util.HashMap;
import java.util.HashSet;

/**
 * https://leetcode.com/problems/word-pattern/#/description
 * Created by yliu12 on 2017/7/16.
 * 33 / 33 test cases passed.
 * Status: Accepted
 * Runtime: 3 ms
 */
public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        char[] patterns = pattern.toCharArray();
        String[] strs = str.split(" ");
        HashMap<Character, String> hm = new HashMap<>();

        if (strs.length != patterns.length) {
            return false;
        }
        for (int i = 0; i < patterns.length; i++) {
            if (hm.containsKey(patterns[i])) {
                if (!hm.get(patterns[i]).equals(strs[i])) {
                    return false;
                }
            } else {
                hm.put(patterns[i], strs[i]);
            }

        }
        HashSet<String> hs = new HashSet<>();

        for (String s : hm.values()) {
            if (hs.contains(s)) {
                return false;
            }
            hs.add(s);
        }
        return true;
    }
}
