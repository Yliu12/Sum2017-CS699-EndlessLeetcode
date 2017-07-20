package bsu.edu.cs699.ying.medium;

import java.util.Map;
import java.util.TreeMap;

/**
 * https://leetcode.com/problems/sort-list/#/description
 * Created by yliu12 on 2017/7/16.
 * <p>
 * 15 / 15 test cases passed.
 * Status: Accepted
 * Runtime: 32 ms
 */
public class SortList {
    public ListNode sortList(ListNode head) {
        ListNode curNode = head;
        Map<Integer, Integer> tm = new TreeMap<>();

        while (curNode != null) {
            if (tm.containsKey(curNode.val)) {
                tm.put(curNode.val, tm.get(curNode.val) + 1);

            } else {
                tm.put(curNode.val, 1);
            }
            curNode = curNode.next;
        }

        ListNode tmp = head;

        for (Map.Entry<Integer, Integer> st : tm.entrySet()) {
            int i = st.getValue();

            while (i > 0) {
                tmp.val = st.getKey();
                tmp = tmp.next;
                i--;
            }

        }
        return head;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

    }
}
