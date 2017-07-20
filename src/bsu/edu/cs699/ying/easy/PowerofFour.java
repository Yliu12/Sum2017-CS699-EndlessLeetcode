package bsu.edu.cs699.ying.easy;

/**
 * https://leetcode.com/problems/power-of-four/#/description
 * Created by yliu12 on 2017/7/19.
 * 1060 / 1060 test cases passed.
 * Status: Accepted
 * Runtime: 2 ms
 */
public class PowerofFour {
    public boolean isPowerOfFour(int num) {
        return num > 0 && (num & (num - 1)) == 0 && (num & 0x55555555) != 0;
        //0x55555555 is to get rid of those power of 2 but not power of 4
        //so that the single 1 bit always appears at the odd position
    }
}
