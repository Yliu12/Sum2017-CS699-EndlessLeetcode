package bsu.edu.cs699.ying.easy;

/**
 * [Reverse String](https://leetcode.com/problems/reverse-string/#/description)
 * Created by yliu12 on 2017/5/26.
 * 476 / 476 test cases passed.
 Status: Accepted
 Runtime: 4 ms
 */
public class ReverseString {
    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
