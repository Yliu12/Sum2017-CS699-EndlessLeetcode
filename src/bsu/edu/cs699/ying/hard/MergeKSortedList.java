package bsu.edu.cs699.ying.hard;

import java.util.Map;
import java.util.TreeMap;

/**
 * https://leetcode.com/problems/merge-k-sorted-lists/#/discuss
 * Created by yliu12 on 7/18/2017.
 * <p>
 * 130 / 130 test cases passed.
 * Status: Accepted
 * Runtime: 22 ms
 */
public class MergeKSortedList {


    public ListNode mergeKLists(ListNode[] lists) {
        Map<Integer, Integer> tm = new TreeMap<>();

        int MaxValue = Integer.MIN_VALUE;

        for (ListNode curNode : lists) {


            while (curNode != null) {
                if (tm.containsKey(curNode.val)) {
                    tm.put(curNode.val, tm.get(curNode.val) + 1);

                } else {
                    tm.put(curNode.val, 1);
                }
                MaxValue = Math.max(curNode.val, MaxValue);
                curNode = curNode.next;

            }
        }
        ListNode result = new ListNode(0);
        ListNode tmp = result;

        if (tm.isEmpty()) {
            return new ListNode(0).next;
        }


        for (Map.Entry<Integer, Integer> st : tm.entrySet()) {
            int i = st.getValue();


            while (i > 0) {
                tmp.val = st.getKey();

                if (tmp.next == null && !(i == 1 && tmp.val == MaxValue)) {
                    tmp.next = new ListNode(MaxValue);
                }

                tmp = tmp.next;
                i--;
            }

        }


        return result;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

    }

    public static void main(String[] args) {
        MergeKSortedList mst = new MergeKSortedList();
        ListNode[] list = new ListNode[1];
        list[0] = new ListNode(0);
        list[0].next = new ListNode(2);
        list[0].next.next = new ListNode(2);
        mst.mergeKLists(list);
    }

}
