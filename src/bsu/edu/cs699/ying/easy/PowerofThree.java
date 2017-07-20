package bsu.edu.cs699.ying.easy;

/**
 * https://leetcode.com/problems/power-of-three/#/description
 * Created by yliu12 on 2017/7/19.
 * <p>
 * 21038 / 21038 test cases passed.
 * Status: Accepted
 * Runtime: 17 ms
 */
public class PowerofThree {
    public boolean isPowerOfThree(int n) {
        // 1162261467 is 3^19,  3^20 is bigger than int
        return (n > 0 && 1162261467 % n == 0);
    }
}
