package bsu.edu.cs699.ying.easy;

import java.util.HashMap;
import java.util.HashSet;

/**
 * https://leetcode.com/problems/isomorphic-strings/#/description
 * Created by yliu12 on 2017/7/16.
 * 30 / 30 test cases passed.
 * Status: Accepted
 * Runtime: 19 ms
 */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        char[] patterns = s.toCharArray();
        char[] strs = t.toCharArray();
        HashMap<Character, Character> hm = new HashMap<>();

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
        HashSet<Character> hs = new HashSet<>();

        for (Character c : hm.values()) {
            if (hs.contains(c)) {
                return false;
            }
            hs.add(c);
        }
        return true;
    }
}
