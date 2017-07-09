package bsu.edu.cs699.ying.easy;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by yliu12 on 2017/7/6.
 * 198 / 198 test cases passed.
 Status: Accepted
 Runtime: 4 ms
 */
public class BestTimetoBuyandSellStockII {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) return 0;
        Integer buy = null, sell = null, profit = 0;

        ArrayList<Integer> actionLists = new ArrayList<>();
        for (int i = 1; i < prices.length - 1; i++) {
            if (prices[i] > prices[i - 1] && prices[i] >= prices[i + 1]) {
                actionLists.add(prices[i] == 0 ? null : prices[i]);
                i++;
                continue;
            }
            if (prices[i] <= prices[i - 1] && prices[i] < prices[i + 1]) {
                actionLists.add(-prices[i]);
            }

        }
        if (actionLists.isEmpty()) {
            return prices[0] > prices[prices.length - 1] ? 0 : prices[prices.length - 1] - prices[0];
        }
        if (actionLists.get(0) > 0 || actionLists.get(0) == null) {
            profit += ((actionLists.get(0) == null ? 0 : actionLists.get(0)) - prices[0]);
            actionLists.remove(0);
        }
        if (!actionLists.isEmpty() && actionLists.get(actionLists.size() - 1) <= 0) {
            profit += (prices[prices.length - 1] + actionLists.get(actionLists.size() - 1));
            actionLists.remove(actionLists.size() - 1);
        }

        for (Integer i : actionLists) {
            profit += i;
        }
        return profit;
    }

    public static void main(String[] args) {
        BestTimetoBuyandSellStockII ks = new BestTimetoBuyandSellStockII();
        int[] martix = {8,6,4,3,3,2,3,5,8,3,8,2,6};
        System.out.println(ks.maxProfit(martix));
    }
}
