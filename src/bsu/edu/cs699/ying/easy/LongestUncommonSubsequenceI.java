package bsu.edu.cs699.ying.easy;

/**
 * https://leetcode.com/problems/longest-uncommon-subsequence-i/#/description
 * Created by yliu12 on 6/28/2017.
 *41 / 41 test cases passed.
 Status: Accepted
 Runtime: 4 ms
 */
public class LongestUncommonSubsequenceI {

    public int findLUSlength(String a, String b) {
        if(a.equals(b))
            return -1;
        else
            return Math.max(a.length(),b.length());

    }
}
