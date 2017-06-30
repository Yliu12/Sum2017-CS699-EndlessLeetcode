package bsu.edu.cs699.ying.easy;

import bsu.edu.cs699.ying.medium.QueueReconstructionbyHeight;

import java.util.ArrayList;

/**
 * https://leetcode.com/problems/minimum-index-sum-of-two-lists/#/description
 * Created by yliu12 on 6/30/2017.
 */
public class MinimumIndexSumofTwoLists {
    public String[] findRestaurant(String[] list1, String[] list2) {
        if (list1[0].equals(list2[0])) {
            String[] result = {list1[0]};
            return result;
        }

        int indexSum = list1.length + list2.length - 2;
        String[] listLong, listShort;
        if (list1.length > list2.length) {
            listLong = list1;
            listShort = list2;
        } else {
            listLong = list2;
            listShort = list1;
        }
        ArrayList<String> resultList = new ArrayList<>();
        for (int curSum = 0; curSum < indexSum; curSum++) {
            int maxi = curSum > listLong.length - 1 ? listLong.length - 1 : curSum;

            for (int i = 0; i <= maxi; i++) {
                int j = (curSum - i);//.> (listShort.length - 1) ? listShort.length - 1 : curSum - i;
                if (j >= listShort.length) {
                    break;
                }
                if (listLong[i].equals(listShort[j])) {
                    resultList.add(listLong[i]);
                }
            }

            if (!resultList.isEmpty()) {
                return resultList.toArray(new String[resultList.size()]);
            }
        }

        return null;
    }

    public static void main(String[] args) {
        MinimumIndexSumofTwoLists ks = new MinimumIndexSumofTwoLists();
        String[] list1 = {"bb", "aa"};
        String[] list2 = {"11", "22", "33", "aa"};

        System.out.println(ks.findRestaurant(list1, list2));


    }
}
