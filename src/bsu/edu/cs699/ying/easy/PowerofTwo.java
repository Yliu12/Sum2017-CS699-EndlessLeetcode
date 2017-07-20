package bsu.edu.cs699.ying.easy;

/**
 * https://leetcode.com/problems/power-of-two/#/description
 * Created by yliu12 on 2017/7/19.
 * <p>
 * 1108 / 1108 test cases passed.
 * Status: Accepted
 * Runtime: 2 ms
 */
public class PowerofTwo {
    public boolean isPowerOfTwo(int n) {
        return ((n & (n - 1)) == 0 && n > 0);
    }
}
