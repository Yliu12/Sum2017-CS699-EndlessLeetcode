package bsu.edu.cs699.ying.easy;

/**
 * https://leetcode.com/problems/range-addition-ii/#/description
 * Created by yliu12 on 6/29/2017.
 * 69 / 69 test cases passed.
 Status: Accepted
 Runtime: 7 ms
 */
public class RangeAdditionII {
    public int maxCount(int m, int n, int[][] ops) {
        int minR=m,minC=n;
        for (int[] matrix : ops){
            minR=Math.min(matrix[0],minR);
            minC=Math.min(matrix[1],minC);
        }
        return minC*minR;
    }


}
