package bsu.edu.cs699.ying.easy;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/#/solutions
 * Created by yliu12 on 2017/7/6.
 *200 / 200 test cases passed.
 Status: Accepted
 Runtime: 3 ms
 */


public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        int maxCur = 0, maxSoFar = 0;
        for (int i = 1; i < prices.length; i++) {
            maxCur = Math.max(0, maxCur += prices[i] - prices[i - 1]);
            maxSoFar = Math.max(maxCur, maxSoFar);
        }
        return maxSoFar;
    }

}
