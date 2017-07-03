package bsu.edu.cs699.ying.easy;

/** https://leetcode.com/problems/find-the-difference/#/description
 * USE ASCII code!
 * Created by yliu12 on 6/28/2017.
 * 54 / 54 test cases passed.
 Status: Accepted
 Runtime: 8 ms
 */
public class FindtheDifference {
    public char findTheDifference(String s, String t) {
        // Initialize variables to store sum of ASCII codes for
        // each string
        int charCodeS = 0, charCodeT = 0;
        // Iterate through both strings and char codes
        for (int i = 0; i < s.length(); ++i) charCodeS += (int)s.charAt(i);
        for (int i = 0; i < t.length(); ++i) charCodeT += (int)t.charAt(i);
        // Return the difference between 2 strings as char
        return (char)(charCodeT - charCodeS);
    }
}
