package bsu.edu.cs699.ying.easy;

/**
 * https://leetcode.com/problems/valid-anagram/#/description
 * Created by yliu12 on 2017/7/10.
 * <p>
 * 34 / 34 test cases passed.
 * Status: Accepted
 * Runtime: 3 ms
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] charcount = new int[26];
        if (s.length() != t.length()) {
            return false;
        }
        for (char c : s.toCharArray()) charcount[c - 'a']++;
        for (char c : t.toCharArray()) charcount[c - 'a']--;
        for (int i : charcount) if (i != 0) return false;

        return true;
    }
}
