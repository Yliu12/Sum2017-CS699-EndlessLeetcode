package bsu.edu.cs699.ying.easy;

import java.util.HashSet;

/**
 * https://leetcode.com/problems/longest-palindrome/#/description
 * Created by yliu12 on 2017/7/16.
 * 95 / 95 test cases passed.
 * Status: Accepted
 * Runtime: 20 ms
 */
public class LongestPalindrome {

    public int longestPalindrome(String s) {
        if ("".equals(s) || null == s) {
            return 0;
        }
        HashSet<Character> hs = new HashSet<>();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (hs.contains(c)) {
                hs.remove(c);
                count++;
            } else {
                hs.add(c);
            }
        }
        if (!hs.isEmpty()) return count * 2 + 1;
        return count * 2;
    }
}
